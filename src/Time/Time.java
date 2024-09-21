package Time;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private String time;

    public Time(int hour, int minute, int second) {
        validateTime();
        this.hour = hour;
        this.minute = minute;
        this.second = second;
//        this.time = hour + ":" + minute + ":" + second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour();
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute();
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSeconds();
        this.second = second;
    }

    public String getTime() {
        return time;
    }

    private void validateTime() {
        validateHour();
        validateMinute();
        validateSeconds();
    }

    private void validateHour() {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }
    private void validateMinute() {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
    }
    private void validateSeconds() {
        if (second > 59) {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
    }
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

}
