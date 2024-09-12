package GeoPoliticalZone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoZoneTest {
    GeoPoliticalZones zones;

    @Test
    public void ifGeoPoliticalZonesExist(){
        GeoPoliticalZones zones;
    }

    @Test
    public void testnorthCentral(){
        zones = GeoPoliticalZones.NORTH_CENTRAL;
        assertEquals("Benue, Kogi, Kwara, Nasarawa, Niger, Plateau, Abuja", zones.getStates());
    }

    @Test
    public void testNorthEast(){
        zones = GeoPoliticalZones.NORTH_EAST;
        assertEquals("Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe", zones.getStates());
    }

    @Test
    public void testSouthEast(){
        zones = GeoPoliticalZones.SOUTH_EAST;
        assertEquals("Abia, Anambra, Ebonyi, Enugu, Imo States", zones.getStates());
    }

    @Test
    public void testNorthWest(){
        zones = GeoPoliticalZones.NORTH_WEST;
        assertEquals("Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara", zones.getStates());
    }

    @Test
    public void testSouthWest(){
        zones = GeoPoliticalZones.SOUTH_WEST;
        assertEquals("Ekiti, Lagos, Ogun, Ondo, Osun, Oyo", zones.getStates());
    }

    @Test
    public void testSouthSouth(){
        zones = GeoPoliticalZones.SOUTH_SOUTH;
        assertEquals("Akwa Ibom, Bayelsa, Cross River, Delta, Edo, Rivers", zones.getStates());
    }

//    @Test
//    public void test_ifNorthCentralcontains(){
//        GeoZone geoZone = new GeoZone();
//        for(GeoPoliticalZones zone : GeoPoliticalZones.values()){
//            assertFalse();
//        }
   // }
}
