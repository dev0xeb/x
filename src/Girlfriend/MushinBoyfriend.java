package Girlfriend;

public class MushinBoyfriend implements Boyfriend{

    @Override
    public void care(){
        System.out.println("I don't Give a fuck");
    }

    @Override
    public void spend() {
        System.out.println("2k Weekly");
    }

    @Override
    public void last() {
        System.out.println("3 hours");
    }
}
