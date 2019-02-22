import java.util.ArrayList;
/**
 * Write a description of class WordList here.
 *
 * @author Madeleine Waldie
 * @version February 22, 2019
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
        int counter = 0; //Create a counter
        for (int a = 0; a < myList.size(); a++) //Go through myList
        {
            if (myList.get(a).length() == len) //Check if a's length is the same as len
            {
                counter++; //Increase the counter
            }
        }
        return counter; //Return how many words have a length equal to len
    }

    /**
     * postcondition: all words that are exactly len letters
     * long have been removed from this WordList, with the 
     * order of the remaining words unchanged
     */
    public void removeWordsOfLength(int len)
    {
        if(numWordsOfLength(len) > 0) //Check if there are words that need removed
        {
            int a = 0; //Create a counter
            while (a < myList.size()) //Go through the list
            {
                if (myList.get(a).length() == len)
                {
                    myList.remove(a); //Remove the element at 'a' if it is the same length as len
                }
                else
                {
                    a++; //If didn't remove anything, increase the counter
                }
            }
        }
    }

    //methods for testing - DO NOT ALTER
    public ArrayList<String> getMyList()
    {
        return myList;
    }

    //constructor and other methods may not shown
}
