import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client[] clients = new Client[3];

        clients[0] = new Client("Ivanov Ivan", 123);
        clients[1] = new Client("Petrov Petr", 199);
        clients[2] = new Client("Sergey Sergeev", 2390);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < clients.length; i++) {
            System.out.println("Введите данные клиента " + (i + 1) + ": ");
            if (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                if (scanner.hasNextInt()) {
                    try {
                        if (clients[i].clientChecked(name, scanner.nextInt()))
                            System.out.println("ИНН клиента совпадает.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    finally {
                        scanner.nextLine();
                        System.out.println();
                    }
                }
                else {
                    System.out.println("Неверно введен ИНН.");
                    scanner.nextLine();
                    System.out.println();
                }
            }
        }
    }
}
