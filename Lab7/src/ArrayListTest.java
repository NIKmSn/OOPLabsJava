import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C#");
        list.add(1, "C++");
        System.out.println(list.get(1));
        System.out.printf("Количество элементов: %d\n", list.size());
        for(String item : list) {
            System.out.println(item);
        }
        if(list.contains("Java")) {
            System.out.println("Список содержит элемент Java");
        }

        list.remove("C#");
        list.remove(0);
        Object[] newList = list.toArray();
        for(Object item : newList) {
            System.out.println(item);
        }
    }
}
