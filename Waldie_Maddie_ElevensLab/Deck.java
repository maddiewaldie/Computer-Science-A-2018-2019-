//Imports
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 * Author: Madeleine Waldie
 * Version: January 28, 2019
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;

    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) 
    {
        //Create new array list of cards
        cards = new ArrayList<Card>();
        for (int j = 0; j < ranks.length; j++) //Go through each rank
        {
            for (String suitString : suits) //Go through each suit
            {
                //Add a new card to the array list
                cards.add(new Card(ranks[j], suitString, values[j]));
            }
        }
        //Set the size of the deck of cards
        size = cards.size();
        //Shuffle the deck of cards
        shuffle();
    }

    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() 
    {
        if (cards.size() == 0) //If deck is empty
        {
            return true;
        }
        else //If deck is not empty
        {
            return false;
        }
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() 
    {
        return size;
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() 
    {
        for(int i = (size - 1); i >= 0; i--)
        {
            int random = (int)(Math.random() * i); //Creates random number
            Card temp = cards.get(random); //Creates a temporary card
            cards.set(random, cards.get(i));
            cards.set(i, temp);
        }
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() 
    {
        size -= 1;
        if (size > 0) 
        {
            return cards.get(size);
        }
        return null;
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() 
    {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) 
        {
            rtn = rtn + cards.get(k);
            if (k != 0) 
            {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) 
            {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) 
        {
            rtn = rtn + cards.get(k);
            if (k != size) 
            {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) 
            {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
