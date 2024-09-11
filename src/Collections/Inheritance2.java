package Collections;

public class Inheritance2 {
    public static void main(String[] args) {
        Box box1 = new Box(12, 12);
        box1.displayBoxName();

        SmallBox box2 = new SmallBox(7, 7);
        box2.displayBoxName();
        box2.printArea();

        BigBox box3 = new BigBox(13, 13, 15);
        box3.displayBoxName();
        box3.printArea();
        }
    }

