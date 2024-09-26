package Reflection;

import java.util.Arrays;

public enum GeoPoliticalZones {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu","Imo"),
    SOUTH_SOUTH("Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private String[] states;

    GeoPoliticalZones(String... states) {
        this.states = states;
    }
    public String[] getStates() {
        return states;
    }

    public GeoPoliticalZones getZone(String state) {
        return GeoPoliticalZones.values()[(ordinal())];
    }

    public String[] toStrings(String states) {
        return GeoPoliticalZones.values()[(ordinal())].toStrings(states);
    }
    public static GeoPoliticalZones getZoneName(String state) {
        GeoPoliticalZones value = null;
        for (GeoPoliticalZones zone : GeoPoliticalZones.values()) {
            if(Arrays.asList(zone.getStates()).contains(state)) {
                value = zone;
                break;
            }
        }
        return value;
    }
}
