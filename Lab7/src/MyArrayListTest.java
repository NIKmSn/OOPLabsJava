public class MyArrayListTest {
    public static void main(String[] args) {
        MyArray<String> myList = new MyArray<String>();
        myList.add("Java");
        myList.add("C#");
        myList.add("C++");
        System.out.println(myList.get(1));
        System.out.println("Количество элементов: " + myList.size());
        for(String item : myList) {
            System.out.println(item);
        }
        System.out.println("Индекс элемента C#: " + myList.indexOf("C#"));
        myList.remove(1);

        Object[] newList = myList.toArray();
        for(Object item : newList) {
            System.out.println(item);
        }
    }
}
