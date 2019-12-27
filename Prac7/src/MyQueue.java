import java.util.Comparator;
import java.util.PriorityQueue;

public class MyQueue extends Deck
{
    private PriorityQueue<Integer> deck = new PriorityQueue<Integer>(Comparator.naturalOrder());
    public void add(int value)
    {
        deck.add(value);
    }
    public int remove()
    {
        return deck.remove();
    }
    public int count()
    {
        return deck.size();
    }
}
