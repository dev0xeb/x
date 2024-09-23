package OnlineShoppingCart;

public class Product {
    private String name;
    private float price;
    private String sku;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Product(String name, float price, String sku){
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    public String getInfo(){
        return String.format("Product: %s, Price: %.2f, SKU: %S", name, price, sku);
    }

    public float applyDiscount(float price, float discount){
        return price * (1 - discount / 100);
    }

}
