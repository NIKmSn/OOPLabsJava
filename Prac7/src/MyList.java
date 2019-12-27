import java.util.LinkedList;

public class MyList extends Deck
{
    private LinkedList<Integer> deck = new LinkedList<>();
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
