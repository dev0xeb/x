package Collections;

public class SmallBox extends Box {
    private int length;
    private int width;

    public SmallBox(int l, int w) {
        super(l, w);
        this.length = l;
        this.width = w;
    }

    public void displayBoxName(){
        System.out.println("I am small box class");
    }

    public void printArea(){
        double area = length * width;
        System.out.println("Area is " + area);
    }
}
