package Television;

public class Television {
    boolean tvStatus= true;
    private int volume = 5;
    private int tvChanel = 1;

    public boolean getTvStatus() {
        return tvStatus;
    }

    public void setTvStatus(boolean tvStatus) {
        this.tvStatus= tvStatus;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {newVolume = 100;}
        if (newVolume < 0) {newVolume = 0;}
        this.volume = newVolume;
    }

    public void increaseVolume(int increaseVolume) {
        this.volume += increaseVolume;
    }

    public void decreaseVolume(int decreaseVolume) {
        this.volume -= decreaseVolume;
    }

    public int getTvChanel() {
        return tvChanel;
    }

    public void setChanel(int chanelNumber) {
        if (chanelNumber <= 1) {
            chanelNumber = 1;
        } else if (chanelNumber >= 20) {
            chanelNumber = 20;
        }
        this.tvChanel = chanelNumber;
    }
}
