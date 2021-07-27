package ds;

import java.util.Arrays;

public class DynamicArray<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;
    private int capacity;

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Illegal capacity: " + capacity);
        this.capacity = capacity;
        elementData = new Object[capacity];
    }

    public boolean add(E element) {
        if (size == capacity)
            grow();
        elementData[size++] = element;
        return true;
    }

    private void grow() {
        capacity = capacity * 2;
        elementData = Arrays.copyOf(elementData, capacity);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(elementData, null);
        size = 0;
    }
}
