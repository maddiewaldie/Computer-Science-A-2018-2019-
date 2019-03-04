//Imports
import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 * Author: Madeleine Waldie
 * Version: January 28, 2019
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;

    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
    public ElevensBoard() 
    {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards) 
    {
        //If the deck is not empty, & it eaither contains a pair that adds up to 11 or a JQK trio
        if (selectedCards.size() == 2) 
        {
            return containsPairSum11(selectedCards);
        } 
        else if (selectedCards.size() == 3) 
        {
            return containsJQK(selectedCards);
        } 
        else {
            return false;
        }
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() 
    {
        //Create bool variable for if play is possible 
        boolean playPossible = true; //Set true for if the cards on the board contain a pair that adds up to 11
        List<Integer> indexes = cardIndexes(); //Create a list of indexes
        if (!containsPairSum11(indexes)) 
        {
            if(containsJQK(indexes))
            {
                playPossible = true; //Plays still possible
            }
            else
            {
                playPossible = false; //No plays possible
            }
        }
        return(playPossible);
    }

    /**
     * Check for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     *              contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards) 
    {
        //Create variables
        boolean contains = false; //Set false in case no cards add up to 11
        int card1;
        int card2;
        //Go through the selected cards
        for (int i = 0; i < selectedCards.size() - 1; i++) 
        {
            for (int j = i + 1; j < selectedCards.size(); j++) 
            {
                card1 = cardAt(selectedCards.get(i)).pointValue(); //Assign first card
                card2 = cardAt(selectedCards.get(j)).pointValue(); // Assign second card
                if ((card1 + card2) == 11) // If card1 and card2 add up to 11
                {
                    contains = true;
                }
            }
        }
        return(contains);
    }

    /**
     * Check for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     *              include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) 
    {
        //Create variables
        boolean jack = false;
        boolean queen = false;
        boolean king = false;
        //Go through the selected cards
        for (int i = 0; i < selectedCards.size(); i++) 
        {
            if (cardAt(selectedCards.get(i)).rank().equals("jack")) 
            {
                jack = true;
            }
            else if (cardAt(selectedCards.get(i)).rank().equals("queen")) 
            {
                queen = true;
            }
            else if (cardAt(selectedCards.get(i)).rank().equals("king")) 
            {
                king = true;
            }
        }

        if (jack && queen && king) //Return true if contains J, Q, and K
        {
            return(true);
        }
        else //Return false if does not contain J, Q, and K
        {
            return(false);
        }
    }
}
