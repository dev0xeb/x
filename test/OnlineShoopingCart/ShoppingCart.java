package OnlineShoopingCart;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<CartItem>Items;

    public ShoppingCart() {
        this.Items = new ArrayList<>();
    }
    public void addItem(Product product, int quantity) {
        for (CartItem item : Items) {
            if (item.getProduct().getSku().equals(product.getSku())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        Items.add(new CartItem(quantity, product));
    }
    public void removeItem(Product sku) {
        Items.removeIf(item -> item.getProduct().getSku().equals(sku.getSku()));
    }
    public float getTotalPrice() {
        return Items.stream().mapToInt(CartItem::getQuantity).sum();
    }
    public ArrayList<CartItem> getItems() {
        return Items;
    }
}
