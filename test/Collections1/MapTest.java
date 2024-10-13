package Collections1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {
    Map map;

    @BeforeEach
    void setUp() {
        map = new Map();
    }

    @Test
    public void testMapIsEmpty() {
        assertTrue(map.isEmpty());
    }

    @Test
    public void testPutAMapIsNotEmpty() {
        assertTrue(map.isEmpty());

    }

}