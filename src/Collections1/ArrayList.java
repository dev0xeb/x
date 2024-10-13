package Collections1;

public class ArrayList {
    private int size;
    private String[] elements;
    private int capacity;

    public ArrayList() {
        this.size = 0;
        this.capacity = 3;
        this.elements = new String[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, String element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for(int counter = size; counter > index; counter--) {
            elements[counter] = elements[counter - 1];
        }
        elements[index] = element;
        size++;
    }

    public boolean addAtEnd(String element) {
        size++;
        return true;
    }

    public void removeByIndex(int index) {
        if (isEmpty())
            throw new IllegalStateException("List is empty");
        size--;
    }

    public int getSize() {
        return size;
    }

    public boolean removeByElement(String element) {
        if (isEmpty())
            throw new IllegalStateException("List is empty");
        for(int index = 0; index < size; index++) {
            if (element.equals(elements[index])) {
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean contains(String element) {
        if (isEmpty())
            throw new IllegalStateException("List is empty");
        for(int index = 0; index < size; index++) {
            if (element.equals(elements[index])) {
                return true;
            }
        }
        return false;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public String get(int index) {
        if(isEmpty())
            throw new IllegalStateException("List is empty");
//        for(int counter =0; counter < size; counter++) {
//            if (elements[counter].equals(elements[index])) {
//                return elements[index];
//            }else{
//                throw new IllegalStateException("Element not found");
//            }
//        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return elements[index];
    }

    public void clear() {
        size = 0;
    }
}
