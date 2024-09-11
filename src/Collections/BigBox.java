package Collections;

public class BigBox extends Box {
    private int length;
    private int width;
    private int height;

    public BigBox(int l, int w, int h) {
        super(l, w);
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public void displayBoxName(){
        System.out.println("I am Big box class");
    }

    public void printArea(){
        double area = length * width * height;
        System.out.println("Area is " + area);
    }
}
