package AirConditioner;

import AirConditioner.AirConditioner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void testAirConditioner_IsOn(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setAcStatus(true);
        assertEquals(true, airConditioner.checkAcStatus());
    }

    @Test
    public void testAirConditioner_IsOff(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setAcStatus(true);
        assertEquals(true, airConditioner.checkAcStatus());
        airConditioner.setAcStatus(false);
        assertEquals(false, airConditioner.checkAcStatus());
    }

    @Test
    public void test_If_AirConditioner_Increases(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setAcStatus(true);

        assertEquals(20,airConditioner.getAcTemperature());
        airConditioner.IncreaseTemperature(3);
        airConditioner.setAcTemperature(23);
        assertEquals(23, airConditioner.getAcTemperature());

    }

    @Test
    public void test_If_AirConditioner_Decreases(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setAcStatus(true);
        assertEquals(20, airConditioner.getAcTemperature());
        airConditioner.DecreaseTemperature(4);
        airConditioner.setAcTemperature(16);
        assertEquals(16, airConditioner.getAcTemperature());
    }

    @Test
    public void test_If_AirConditioner_IncreasesTemperature_Beyond30(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setAcStatus(true);
        assertEquals(20, airConditioner.getAcTemperature());
        airConditioner.setAcTemperature(31);
        assertEquals(30, airConditioner.getAcTemperature());
    }

    @Test
    public void test_If_AirConditioner_DecreasesTemperature_Beyond16(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setAcStatus(true);
        assertEquals(20, airConditioner.getAcTemperature());
        airConditioner.setAcTemperature(15);
        assertEquals(16, airConditioner.getAcTemperature());
    }
}