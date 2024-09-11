package Television;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {

    @Test
    public void test_Television_can_Turn_On() {
        Television television = new Television();
        television.getTvStatus();
        assertEquals(true, television.getTvStatus());
    }

    @Test
    public void test_Television_can_Turn_Off() {
        Television television = new Television();
        television.getTvStatus();
        assertEquals(true, television.getTvStatus());
        television.setTvStatus(false);
        assertEquals(false, television.getTvStatus());
    }

    @Test
    public void test_Television_can_Increase_Volume() {
        Television television = new Television();
        assertEquals(true, television.getTvStatus());
        assertEquals(5, television.getVolume());
        television.increaseVolume(5);
        assertEquals(10, television.getVolume());
    }

    @Test
    public void test_Television_can_Decrease_Volume() {
        Television television = new Television();
        assertEquals(true, television.getTvStatus());
        assertEquals(5, television.getVolume());
        television.decreaseVolume(4);
        assertEquals(1, television.getVolume());
    }

    @Test
    public void test_Television_Volume_Cant_Go_Beyond_100() {
        Television television = new Television();
        assertEquals(true, television.getTvStatus());
        assertEquals(5, television.getVolume());
        television.setVolume(101);
        assertEquals(100, television.getVolume());
    }

    @Test
    public void test_Television_Volume_Cant_Go_Below_0() {
        Television television = new Television();
        assertEquals(true, television.getTvStatus());
        assertEquals(5, television.getVolume());
        television.setVolume(-1);;
        assertEquals(0, television.getVolume());
    }

    @Test
    public void test_Television_DisplayChanel(){
        Television television = new Television();
        assertEquals(true, television.getTvStatus());
        assertEquals(1, television.getTvChanel());
    }

    @Test
    public void test_Television_CanChange_Chanel() {
        Television television = new Television();
        assertEquals(true, television.getTvStatus());
        assertEquals(1, television.getTvChanel());
        television.setChanel(5);
        assertEquals(5, television.getTvChanel());
    }

    @Test
    public void test_TelevisionChanel_Cant_Go_Below_1() {
        Television television = new Television();
        assertEquals(true, television.getTvStatus());
        assertEquals(1, television.getTvChanel());
        television.setChanel(0);
        assertEquals(1, television.getTvChanel());
    }

    @Test
    public void test_TelevisionChanel_Cant_Go_Beyond_20() {
        Television television = new Television();
        assertEquals(true, television.getTvStatus());
        assertEquals(1, television.getTvChanel());
        television.setChanel(21);
        assertEquals(20, television.getTvChanel());
    }
}
