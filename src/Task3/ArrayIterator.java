package Task3;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private int currentIndex = 0;
    private final T[] array;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return array.length > currentIndex;
    }

    @Override
    public T next() {
        T item = array[currentIndex];
        currentIndex++;
        return item;
    }
}
