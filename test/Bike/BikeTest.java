package Bike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void test_if_Bike_Is_On(){
        Bike bike = new Bike();
        bike.checkBikeStatus();
        assertEquals(true, bike.checkBikeStatus());
    }

    @Test
    public void test_if_Bike_Is_Off(){
        Bike bike = new Bike();
        bike.checkBikeStatus();
        bike.setBikeStatus(false);
        assertEquals(false, bike.checkBikeStatus());
    }

    @Test
    public void check_If_Bike_Speed_Can_Increase(){
        Bike bike = new Bike();
        bike.checkBikeStatus();
        bike.getGear();
        bike.speedIncrement(3);
        assertEquals(true, bike.checkBikeStatus());
    }
}
