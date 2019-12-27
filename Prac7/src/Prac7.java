import java.util.Scanner;

public class Prac7
{
    public static void getDeck(Deck deck)
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++)
        {
            deck.add(scanner.nextInt());
        }
    }
    public static void main(String[] args)
    {
        Table table = new Table();
        Deck deck1, deck2;
        //deck1 = new MyStack();
        //deck2 = new MyStack();
        //deck1 = new MyQueue();
        //deck2 = new MyQueue();
        //deck1 = new MyDequeue();
        //deck2 = new MyDequeue();
        deck1 = new MyList();
        deck2 = new MyList();

        System.out.println("Deck 1: ");
        getDeck(deck1);
        System.out.println("Deck 2: ");
        getDeck(deck2);
        table.play(deck1, deck2);
    }
}
