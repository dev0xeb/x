package GeoPoliticalZone;

public enum GeoPoliticalZones {
    NORTH_CENTRAL("Benue, Kogi, Kwara, Nasarawa, Niger, Plateau, Abuja"),
    NORTH_EAST( "Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe"),
    SOUTH_EAST("Abia, Anambra, Ebonyi, Enugu, Imo States"),
    NORTH_WEST("Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara"),
    SOUTH_WEST( "Ekiti, Lagos, Ogun, Ondo, Osun, Oyo"),
    SOUTH_SOUTH( "Akwa Ibom, Bayelsa, Cross River, Delta, Edo, Rivers");


    private final String states;

    GeoPoliticalZones(String states){
        this.states = states;
    }

    public String getStates() {
        return states;
    }
}
