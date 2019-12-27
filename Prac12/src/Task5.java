import java.io.File;
import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //D:\\NIK\\Desktop\\text.txt
        String address = scanner.nextLine();
        String text = "";
        try
        {
            scanner = new Scanner(new File(address));
            String[] splitted = scanner.nextLine().split(" ");
            String newText = splitted[0];
            int count = 1;
            while (count != splitted.length)
            {
                for (int i = 0; i < splitted.length; i++)
                {
                    if(splitted[i].charAt(0) ==  newText.charAt(newText.length() - 1))
                    {
                        newText += " " + splitted[i];
                        count++;
                        if (count == splitted.length)
                            break;
                    }
                }
            }
            System.out.println(newText);

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
