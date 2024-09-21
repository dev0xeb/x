package Time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    private Time time;

    @BeforeEach
    public void setUp() {
        Time time = new Time(12, 56, 23);
    }

    @Test
    public void test_hours() {
        time = new Time(12, 56, 23);
        assertEquals(12, time.getHour());
    }

    @Test
    public void test_minutes() {
        time = new Time(12, 56, 23);
        assertEquals(56, time.getMinute());
    }

    @Test
    public void test_seconds() {
        time = new Time(12, 56, 70);
        assertEquals(70, time.getSecond());
    }

}
