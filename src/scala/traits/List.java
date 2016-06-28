package scala.traits;

/**
 * Created on 01.05.16.
 *
 * @author evgen
 */
public interface List<T> {

    void add(T t);
    T get(int i);

}

class ListImpl<T> implements List<T> {

    private T[] elements;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public ListImpl(int capacity) {
        elements = (T[])new Object[capacity];
    }

    public ListImpl() {
        this(10);
    }

    @Override
    public void add(T t) {
        ensureCapacity();
        elements[size] = t;
        size++;
    }

    @Override
    public T get(int i) {
        return elements[i];
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if(size == elements.length) {
            int newLength = elements.length << 1;
            T[] newElements = (T[])new Object[newLength];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ListImpl{ ");
        for(int i = 0; i < size; i ++) {
            builder.append(elements[i]).append(", ");
        }
        builder.append("}");
        return builder.toString();
    }
}
