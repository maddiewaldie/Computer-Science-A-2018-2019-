import java.util.ArrayList;
/**
 * Write a description of class WordList here.
 *
 * @author College Board
 * @version (a version number or a date)
 */
public class WordList
{
    private ArrayList<String> myList; //contains Strings mde up of letters
    
    /**
     * constructor - DO NOT ALTER
     * used for testing purposes
     */
    public WordList( ArrayList<String> words )
    {
        myList = words;
    }
    /**
     * postcondition: returns the number of words in this WordList
     * that are exactly len letters long
     */
    public int numWordsOfLength(int len)
    {
        /* to be implemented in part (a) */
    }
    
    /**
     * postcondition: all words that are exactly len letters
     * long have been removed from this WordList, with the 
     * order of the remaining words unchanged
     */
    public void removeWordsOfLength(int len)
    {
        /* to be implemented in part (b) */
    }
    
    
    //methods for testing - DO NOT ALTER
    public ArrayList<String> getMyList()
    {
        return myList;
    }
    
    //constructor and other methods may not shown
}
