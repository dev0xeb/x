package Collections;
import java.util.ArrayList;

public class Arraylist {
    private java.util.ArrayList<String> list;

    public Arraylist() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String element) {
        list.add(element);
    }

    public int size() {
        return list.size();
    }

    public void remove(int index) {
            list.remove(index);
    }

    public String get(int index) {
        return list.get(index);
    }
}
