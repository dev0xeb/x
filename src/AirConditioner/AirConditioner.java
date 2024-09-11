package AirConditioner;

public class AirConditioner {
    private boolean AcStatus = false;
    private int AcTemperature= 20;

    public  boolean checkAcStatus(){
        return AcStatus;
    }

    public void setAcStatus(boolean AcStatus){
        this.AcStatus = AcStatus;
    }

    public int getAcTemperature() {
        return AcTemperature;
    }
    public void setAcTemperature(int Temperature) {
        if (Temperature > 30)
            this.AcTemperature = 30;
        if (Temperature < 16)
            this.AcTemperature = 16;
    }
    public void IncreaseTemperature(int temperature){
        AcTemperature += temperature;
    }
    public void DecreaseTemperature(int temperature){
        AcTemperature -= temperature;
    }
}


