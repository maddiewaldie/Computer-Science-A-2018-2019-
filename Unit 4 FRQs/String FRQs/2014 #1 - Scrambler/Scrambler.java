import java.util.*;
/**
 * Write a description of class Scrambler here.
 *
 * @author Madeleine Waldie
 * @version February 22, 2019
 */
public class Scrambler
{
    /**
     * Scrambles a given word.
     * @param word the word to be scrambled
     * @return the scrambled word (possibly equal to word)
     * Precondition: word is either an empty string or contains
     * only uppercase letters
     * Postcondition: the string returned was created from word as 
     * follows:
     *   - the word was scrambled, beginning at the first letter and
     *   continuing from left to right
     *   - two consecultive letters consisting of "A" followed by a letter
     *   that was not "A" were swapped
     *   - letters were swapped at most once
     */
    public static String scrambleWord(String word)
    {
        /* to be implemented in part (a) */
        String scrambled = ""; //Create a string to add the scrambled word onto
        int i = 0; //Create a counter

        while (i < word.length()) //Go through word string
        {
            //Create variables for 1st & 2nd letters
            String l1 = word.substring(i, i+1);
            String l2 = ""; //Make l2 empty for now

            if (i < word.length() - 1) //If l2 needs filled
            {
                l2 = word.substring(i+1, i+2); //Fill l2
            }

            if (l1.equals("A") && !l2.equals("A") && !l2.equals("")) //if the first letter is A & letter 2 isn't a or empty
            {
                scrambled += l2 + l1; //add the first  & second letter onto the scrambled string
                i += 2; //increment i by 2
            }
            else //Otherwise
            {
                scrambled += l1; //add the first letter onto the scrambled string
                i ++; //increment i by 1
            }
        }
        return scrambled; //Return the new scrambled string
    }

    /**
     * Modifies wordList by replacing each word with its scrambled
     * version, removing any words that are unchanged as a result
     * of scrambling.
     * @param wordList the list of words
     * Precondition: wordList contains only non-null objects
     * Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same
     *  as it was before the method was called
     *  
     *  Note: the original method from the FRQ is void, but to test
     *  the method, the wordList will need to be returned.
     */
    public static List<String> scrambleOrRemove(List<String> wordList)
    {
        /* to be implemented in part (b) */

        //add code for part b above
        return wordList; //DO NOT CHANGE - return used for testing
    }
}
