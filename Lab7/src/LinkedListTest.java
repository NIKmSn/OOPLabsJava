import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C#");
        list.add(1, "C++");
        list.addFirst("Kotlin");
        list.addLast("Python");
        System.out.println(list.get(1));
        System.out.printf("Количество элементов: %d\n", list.size());
        for(String item : list) {
            System.out.println(item);
        }
        if(list.contains("Java")) {
            System.out.println("Список содержит элемент Java");
        }

        list.remove("Java");
        list.removeFirst();
        list.removeLast();
        LinkedList<Language> languages = new LinkedList<Language>();
        languages.add(new Language("Go"));
        languages.addFirst(new Language("JavaScript"));
        languages.addLast(new Language("PHP"));
        languages.remove(1);
        System.out.println("Первый элемент удален.");
        for(Language item : languages) {
            System.out.println(item.getName());
        }
    Language first = languages.getFirst();
    System.out.println("Первый элемент коллекции: " + first.getName());
     }
}
class Language {
    private String name;
    public Language(String value) {
        name=value;
    }
    String getName(){
        return name;
    }
}
