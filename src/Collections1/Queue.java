package Collections1;

public class Queue {
    private int size;
    private int capacity = 3;
    private String[] elements;

    public Queue() {
        elements = new String[capacity];
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String element) {
        if(isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        elements[size] = element;
        size++;
    }

    public String remove() {
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        String element = elements[0];
        for(int index = 1; index < size; index++) {
            elements[index - 1] = elements[index];
        }
        size--;
        return element;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public String peek() {
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return elements[0];
    }

    public String retrieve() {
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return elements[0];
    }

    public boolean offer(String element) {
        if(isFull()){
            return false;
        }
        elements[size] = element;
        size++;
        return true;
    }
}
