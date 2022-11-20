import java.util.Arrays;

public class Array<T> {
    private T[] array;
    private int size;

    public Array() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
    }

    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void add(T item) {
        if (size == array.length) {
            resize();
        }
        array[size] = item;
        size++;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == array.length) {
            resize();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T item = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return item;
    }

    public void set(int index, T item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = item;
    }

    public int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    public void sort() {
        Arrays.sort(array, 0, size);
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += array[i];
            if (i < size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}