import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToList<E> {
    public static List convert(Object[] array) {
        List arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);
        return arrayList;
    }

    public static void main(String[] args) {
        Object[] array = {0, 1, 2, 3, 4};
        List list;
        list = convert(array);
        for (Object element : list) {
            System.out.print(element + " ");
        }
    }
}