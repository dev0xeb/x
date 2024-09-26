package Reflection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalTest {
    String[] zones;

    @Test
    public void test_ToReturnUserChoice() {
        String name = "Benue";
        zones = GeoPoliticalZones.getZoneName(name).getStates();
        String expected = String.valueOf(GeoPoliticalZones.NORTH_CENTRAL);
        assertEquals(Arrays.toString(zones), expected);
    }
}
