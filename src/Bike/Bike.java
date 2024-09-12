package Bike;

public class Bike {
    private boolean BikeStatus = true ;
    private int gear = 1;
    private int speed;
    public boolean checkBikeStatus() {
        return BikeStatus;
    }

    public void setBikeStatus(boolean BikeStatus) {
        this.BikeStatus = BikeStatus;
    }
    public int getGear() {
        return gear;
    }
    public int getSpeed() {
        return speed;
    }
    private void setGear() {
        if (speed < 24) {
            gear = 1;
        }else if (speed < 35){
            gear = 2;
        }else if (speed < 44){
            gear = 3;
        }else
            gear = 4;
    }
    public int speedIncrement(int accerlation) {
        return speed + accerlation;
    }

}
