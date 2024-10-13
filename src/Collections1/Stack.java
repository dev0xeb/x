package Collections1;

public class Stack {
    private String[] elements;
    private int size;
    private final int capacity = 3;

    public Stack() {
        elements = new String[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(String element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        elements[size] = element;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        String element = elements[size - 1];
        size--;
    }

    public int capacity() {
        return capacity;
    }

    public int getSize(){
        return size;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    public int search(String element) {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        for (int index = 0; index < size; index++) {
            if (element.equals(elements[index])) {
                return index;
            }
        }
        return -1;
    }
}

