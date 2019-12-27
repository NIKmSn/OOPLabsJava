import java.util.AbstractList;

public class MyArray<T> extends AbstractList<T> {

    private Object[] array = new Object[16];
    private int numberOfElements = 0;

    public boolean add(T item) {
        if(numberOfElements == array.length-1)
            resize(array.length*2);
        array[numberOfElements++] = item;
        return true;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public T remove(int index) {
        if (numberOfElements - index >= 0)
            System.arraycopy(array, index + 1, array, index, numberOfElements - index);
        Object deleted = array[index];
        array[numberOfElements] = null;
        numberOfElements--;
        return (T)deleted;
    }

    public int size() {
        return numberOfElements;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, numberOfElements);
        array = newArray;
    }
}
