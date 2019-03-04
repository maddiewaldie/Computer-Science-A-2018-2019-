
/**
 * Write a description of class StringWarmup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringWarmup
{
    /**
     * Write a method countWords which counts the number of words
     * in the String parameter.  A word is defined as a set of characters
     * Words can be found at the beginning, middle, and end of a sentance.
     * Words in the middle of a sentance are separated by spaces.
     * 
     * @param String phrase - the phrase to count the words of
     * @return int - the number of words in the phrase
     */
    public int countWords(String phrase)
    {
        //Create counter
        int count = 0;

        //Go through only if 
        if(phrase.length() > 0)
        {
            for(int i = 1; i < phrase.length(); i++)
            {
                if((phrase.charAt(i-1) != ' ' &&  phrase.charAt(i) == ' ') || (phrase.charAt(i-1) == '.'))
                {
                    count++; //Increase counter by 1
                }
            }
            count++; //Increase counter by 1
            if(phrase.length() == count)
            {
                count = 0; //Set count to 0
            }
            else  if(phrase.charAt(phrase.length() - 1) == ' ')
            {
                count --; //Decrement counter by 1
            }
        }
        return count;
    }
}
