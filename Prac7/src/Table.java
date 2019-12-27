public class Table
{
    private void compare(Deck deck1, Deck deck2)
    {
        int card1 = deck1.remove();
        int card2 = deck2.remove();
        if (card1 > card2)
        {
            deck1.add(card1);
            deck1.add(card2);
        }
        else
        {
            deck2.add(card2);
            deck2.add(card1);
        }
    }
    public void play(Deck deck1, Deck deck2)
    {
        int attemptCount = 0;
        while (true)
        {
            if (deck1.count() == 0)
            {
                System.out.println("Second. Attempts: " + attemptCount);
                break;
            }
            else if (deck2.count() == 0)
            {
                System.out.println("First. Attempts:  " + attemptCount);
                break;
            }
            else if (attemptCount == 106)
            {
                System.out.println("botva");
                break;
            }
            compare(deck1, deck2);
            attemptCount++;
        }
    }
}
