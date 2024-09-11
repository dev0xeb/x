package Collections;
import java.util.HashSet;
import java.util.Set;

public class Sets {
    private Set<String> set;

    public Sets() {
        this.set = new HashSet<String>();
    }
    public boolean isEmpty() {
        return set.isEmpty();
    }

    public void add(String element) {
        set.add(element);
    }

    public int size() {
        return set.size();
    }

    public void remove(String element) {
        set.remove(element);
    }

    public boolean contain(String element) {
        return set.contains(element);
    }

    public void clear() {
        set.clear();
    }
}
