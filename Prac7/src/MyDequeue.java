import java.util.ArrayDeque;

public class MyDequeue extends Deck
{
    ArrayDeque<Integer> deck = new ArrayDeque<Integer>();

    public void add(int value)
    {
        deck.addFirst(value);
    }

    public int remove()
    {
        return deck.removeLast();
    }

    public int count()
    {
        return deck.size();
    }
}
