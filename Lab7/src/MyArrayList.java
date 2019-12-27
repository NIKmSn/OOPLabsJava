import java.util.ArrayList;
import java.util.ListIterator;

public class MyArrayList<E> extends ArrayList<E> {

    @Override
    public void add(int index, E element) {
        super.add(index, element);
        System.out.println("Added " + element + " at index " + index);
    }

    @Override
    public void clear() {
        super.clear();
        System.out.println("MyArrayList cleared.");
    }


    @Override
    public E get(int index) {
        return super.get(index);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public E remove(int index) {
        return super.remove(index);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public E set(int index, E element) {
        return super.set(index, element);
    }
}
