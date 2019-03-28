
/**
 * Write a description of class RecursionTester here.
 *
 * @author Madeleine Waldie
 * @version March 28, 2019
 */
public class RecursionTester
{
    /**
     * RemoveLetters Method
     * Has a string parameter for a phrase & another String parameter for a letter.
     * Method removes all occurrances of letter from the phrase.
     */
    public static String RemoveLetters(String phrase, String letter)
    {
        String newString = phrase;
        String c;
        String s;
        if(phrase.length() == 0) // base cases
        {
            return("");
        }
        else
        {
            int i = phrase.indexOf(letter);
            String f = phrase.substring(0, 1);
            if(f.equals(letter))
            {
                return RemoveLetters(newString.substring(1), letter);
            }
            else
            {
                s = newString.substring(0, 1);
                newString = newString.substring(1);
                return s + RemoveLetters(newString, letter);
            }   
        }
    }
}
