package Collections1;

public class Set {
    private int size;
    private  int capacity;
    private String[] elements;

    public Set(int capacity) {
        this.size = 0;
        elements = new String[capacity];
        this.capacity = capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean add(String element) {
        for(int index = 0; index < size; index++) {
            if (element.equals(elements[index])) {
                throw new IllegalStateException("Element already exists");
            }
        }
        if (size < capacity) {
            elements[size] = element;
            size++;
            return true;
        }  else {
            throw new IllegalStateException("Set is full");
        }
    }

    public boolean remove(String clinton) {
        if(isEmpty()){
            throw new IllegalStateException("Set is empty");
        }
        for(int index = 0; index < size; index++) {
            if (elements[index].equals(clinton)) {
                for(int counter =index; counter < size -1; counter++) {
                    elements[counter] = elements[counter+1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(String element) {
        if(!isEmpty()){
            for(int index = 0; index < size; index++) {
                if(elements[index].equals(element)){
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException("Set is empty");
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void clear() {
        size = 0;
    }
}
