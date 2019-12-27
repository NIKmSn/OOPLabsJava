import java.util.Stack;

public class MyStack extends Deck
{
    private Stack<Integer> deck = new Stack<>();
    public void add(int value)
    {
        toReverse();
        deck.push(value);
        toReverse();
    }
    public int remove()
    {
        return deck.pop();
    }
    private void toReverse()
    {
        Stack<Integer> temp = new Stack<Integer>();
        while (!deck.empty())
        {
            temp.push(deck.pop());
        }
        deck = temp;
    }
    public int count()
    {
        return deck.size();
    }
}
