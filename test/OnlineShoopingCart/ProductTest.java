package OnlineShoopingCart;

import OnlineShoppingCart.Product;
import OnlineShoppingCart.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    private Product laptop;
    private ShoppingCart cart;
    private Product mouse;
    @BeforeEach
    public void setUp() {
        laptop = new Product("Laptop", 999.99F, "Lap123");
        mouse = new Product("mouse", 25.50F, "Mouse143");
        cart = new ShoppingCart();
    }
    @Test
    public void createAProduct() {
        cart.addItem(laptop, 2);
        cart.addItem(mouse, 2);
        assertEquals(2, cart.getItems().size());
        assertEquals(2, cart.getItems().get(0).getQuantity());
        assertEquals(2, cart.getItems().get(1).getQuantity());
    }
}
