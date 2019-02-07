import junit.framework.*;
import java.util.*;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test Part A
    public void testA1()
    {
        String word = "TAN";
        String scrambled = Scrambler.scrambleWord(word);
        
        String expected = "TNA";
        
        String msg = "Scrambled word returned: "+scrambled+"\n check tester for expected result";
        assertTrue(msg, scrambled.equals(expected));
    }
    public void testA2()
    {
        String word = "ABRACADABRA";
        String scrambled = Scrambler.scrambleWord(word);
        
        String expected = "BARCADABARA";
        
        String msg = "Scrambled word returned: "+scrambled+"\n check tester for expected result";
        assertTrue(msg, scrambled.equals(expected));
    }
    public void testA3()
    {
        String word = "WHOA";
        String scrambled = Scrambler.scrambleWord(word);
        
        String expected = "WHOA";
        
        String msg = "Scrambled word returned: "+scrambled+"\n check tester for expected result";
        assertTrue(msg, scrambled.equals(expected));
    }
    public void testA4()
    {
        String word = "AARDVARK";
        String scrambled = Scrambler.scrambleWord(word);
        
        String expected = "ARADVRAK";
        
        String msg = "Scrambled word returned: "+scrambled+"\n check tester for expected result";
        assertTrue(msg, scrambled.equals(expected));
    }
    public void testA5()
    {
        String word = "EGGS";
        String scrambled = Scrambler.scrambleWord(word);
        
        String expected = "EGGS";
        
        String msg = "Scrambled word returned: "+scrambled+"\n check tester for expected result";
        assertTrue(msg, scrambled.equals(expected));
    }
    public void testA6()
    {
        String word = "A";
        String scrambled = Scrambler.scrambleWord(word);
        
        String expected = "A";
        
        String msg = "Scrambled word returned: "+scrambled+"\n check tester for expected result";
        assertTrue(msg, scrambled.equals(expected));
    }
    public void testA7()
    {
        String word = "";
        String scrambled = Scrambler.scrambleWord(word);
        
        String expected = "";
        
        String msg = "Scrambled word returned: "+scrambled+"\n check tester for expected result";
        assertTrue(msg, scrambled.equals(expected));
    }
    //Test Part B
    public void testB1()
    {
        List<String> words = new ArrayList<String>();
        words.add("TAN");
        words.add("ABRACADABRA");
        words.add("WHOA");
        words.add("APPLE");
        words.add("EGGS");
        
        List<String> scrambledList = Scrambler.scrambleOrRemove(words);
        
        String[] expected = {"TNA","BARCADABARA","PAPLE"};
        
        String msg = "Scrambled List returned: "+scrambledList+"\n check tester for expected result";
        assertTrue(msg, listsMatch(scrambledList,expected));
        
    }
    //helper methods for testing
    /**
     * check if the list of words matches the array of words
     */
    private boolean listsMatch(List<String> list, String[] arr)
    {
        if(list.size()!=arr.length)
        {
            return false;
        }
        for(int i=0; i<list.size();i++)
        {
            if(!list.get(i).equals(arr[i]))
            {
                return false;
            }
        }
        return true;
    }
}
