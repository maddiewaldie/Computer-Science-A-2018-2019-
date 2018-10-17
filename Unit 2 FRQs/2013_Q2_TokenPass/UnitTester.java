import junit.framework.*;
import java.util.ArrayList;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test Part A: Constructor
    public void testA1()
    {
        TokenPass tp = new TokenPass(5);
        int[] board = tp.getBoard();
        int currentPlayer = tp.getCurrentPlayer();
        assertTrue(checkBoard(board,5) && checkPlayer(currentPlayer, board)&&!allZero(currentPlayer, board)); 
    }
    public void testA2()
    {
        TokenPass tp = new TokenPass(15);
        int[] board = tp.getBoard();
        int currentPlayer = tp.getCurrentPlayer();
        assertTrue(checkBoard(board,15) && checkPlayer(currentPlayer, board)&&!allZero(currentPlayer, board));
    }
    public void testA3()
    {
        TokenPass tp = new TokenPass(1);
        int[] board = tp.getBoard();
        int currentPlayer = tp.getCurrentPlayer();
        assertTrue(checkBoard(board,1) && checkPlayer(currentPlayer, board));
    }
    public void testA4()
    {
       TokenPass tp = new TokenPass(40);
        int[] board = tp.getBoard();
        int currentPlayer = tp.getCurrentPlayer();
        assertTrue(checkBoard(board,40) && checkPlayer(currentPlayer, board)&&!allZero(currentPlayer, board));
    }
    
    public void testA5()
    {
        TokenPass tp = new TokenPass(100);
        int[] board = tp.getBoard();
        int currentPlayer = tp.getCurrentPlayer();
        assertTrue(checkBoard(board,100) && checkPlayer(currentPlayer, board)&&!allZero(currentPlayer, board));
    }

    //Test part B: distributeCurrentPlayerTokens
    public void testB1()
    {
        int[] board = {3,2,6,10};
        int actualPlayer = 2;
        TokenPass tp = new TokenPass(actualPlayer, board);
        tp.distributeCurrentPlayerTokens();
        int[] currentBoard = tp.getBoard();
        int[] expectedBoard = {5,3,1,12};
        int currentPlayer = tp.getCurrentPlayer();
        
        assertTrue(boardsMatch(currentBoard, expectedBoard) && actualPlayer==currentPlayer);
    }
    public void testB2()
    {
        int[] board = {3,2,6,10};
        int actualPlayer = 3;
        TokenPass tp = new TokenPass(actualPlayer, board);
        tp.distributeCurrentPlayerTokens();
        int[] currentBoard = tp.getBoard();
        int[] expectedBoard = {6,5,8,2};
        int currentPlayer = tp.getCurrentPlayer();
        
        assertTrue(boardsMatch(currentBoard, expectedBoard) && actualPlayer==currentPlayer);
    }
    public void testB3()
    {
        int[] board = {3,2,6,10};
        int actualPlayer = 0;
        TokenPass tp = new TokenPass(actualPlayer, board);
        tp.distributeCurrentPlayerTokens();
        int[] currentBoard = tp.getBoard();
        int[] expectedBoard = {0,3,7,11};
        int currentPlayer = tp.getCurrentPlayer();
        
        assertTrue(boardsMatch(currentBoard, expectedBoard) && actualPlayer==currentPlayer);
    }
    
    //methods for testing - do not alter
    private boolean checkBoard(int[] board, int count)
    {
        if(board.length!=count){
            return false;
        }
        for(int i=0; i<board.length; i++)
        {
            if(board[i]>10||board[i]<0)
            {
                return false;
            }
        }
        return true;
    }
    private boolean checkPlayer(int player, int[] board)
    {
        if (player<0 || player>=board.length)
        {
            return false;
        }
        else{
            return true;
        }
        
    }
    private boolean allZero(int player, int[] board)
    {
        int count = 0;
        for(int i=0; i<board.length; i++)
        {
            if(board[i]==0)
            {
                count++;
            }
        }
        if(player==0)
        {
            count++;
        }
        return count==(board.length+1);
    }
    private boolean boardsMatch(int[] current, int[] expected)
    {
        if(current.length!=expected.length)
            return false;
        for(int i=0; i<current.length; i++)
        {
            if(current[i]!=expected[i])
            {
                return false;
            }
        }
        return true;
    }
}
