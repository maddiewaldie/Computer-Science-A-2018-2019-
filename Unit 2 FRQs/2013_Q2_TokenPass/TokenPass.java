
/**
 * Write a description of class TokenPass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TokenPass
{
    private int[] board;
    private int currentPlayer;

    /**
     * Creates the board array to be of size playerCount and fills it with
     * random integer values from 1 to 10, inclusive.  Initializes currentPlayer to a
     * random integer value in the range between 0 and playerCount-1, inclusive.
     * @param playerCount the number of players
     */
    public TokenPass(int playerCount)
    {
        // set the size of the board
        board = new int[playerCount];
        
        // as long as the amount of players is greater than the counter, it will go through the for loop
        for (int i = 0; i < playerCount; i++)
        {
            // Put values into the board - need ro cast a double to an int
            board[i] = (int)(10 * Math.random()) + 1;
        }
        
        // initialize the current player - need to cast a double to an int
        currentPlayer = (int)(playerCount * Math.random());
    }

    /**
     * Distribues the tokens from the current player's position one at a time to each
     * player in the game.  Distribution with the next position and 
     * continues until all the token have been distributed.  If there 
     * are still tokens to distribute when the player at the highest
     * position is reached, the next token will be distributed to the player
     * at position 0.
     * Precondition: the current player has at least one token.
     * Postcondition: the current player has not changed.
     */
    public void distributeCurrentPlayerTokens()
    {
        // initialize variables
        int numberOfTokens = board[currentPlayer];
        int i = currentPlayer;
        
        board[currentPlayer] = 0;
        
        // ss long as the player has enough tokens, the loop will continue
        while (numberOfTokens > 0)
        {
            i = (i+1) % board.length;
            board[i]++;
            numberOfTokens--;
        }
    }
    
    //methods used for testing - do not alter
    public int[] getBoard()
    {
        return board;
    }

    public int getCurrentPlayer()
    {
        return currentPlayer;
    }
    //overloaded constructor for testing - do not alter
    public TokenPass(int cp, int[] b)
    {
        currentPlayer = cp;
        board = b;
    }
}
