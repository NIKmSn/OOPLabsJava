import java.io.*;
import java.util.*;

public class TextFiles {
    public static void main(String[] args) {
        //Запись в файл введённой с клавиатуры информации
        System.out.println("Введите текст для записи в файл: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        try (FileWriter writer = new FileWriter("text.txt", true)){
            writer.write(str);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //Вывод информации из файла на экран
//        try (FileReader reader = new FileReader("text.txt")){
//            Scanner scan = new Scanner(reader);
//            while (scan.hasNextLine()) {
//                System.out.println(scan.nextLine());
//            }
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

        //Замена информации в файле на информацию, введённую с клавиатуры
//        System.out.println("Введите текст для записи в файл: ");
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        s.close();
//        try (FileWriter writer = new FileWriter("text.txt", false)){
//            writer.write(str);
//            writer.write('\n');
//            writer.flush();
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

        //Добавление в конец исходного файла текста, введённого с клавиатуры
//        System.out.println("Введите текст для добавления в конец файла: ");
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        s.close();
//        try (FileWriter writer = new FileWriter("text.txt", true)){
//            writer.append(str);
//            writer.write('\n');
//            writer.flush();
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

    }
}
