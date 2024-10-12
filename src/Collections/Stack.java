package Collections;

public class Stack {
    private int size;
    private int capacity = 3;
    private boolean isFull;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(String element) {
        size++;
    }

    public void pop() {
        size--;
    }

    public int Capacity() {
        return capacity;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
