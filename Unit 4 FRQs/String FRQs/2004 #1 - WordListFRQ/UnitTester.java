import junit.framework.*;
import java.util.ArrayList;
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
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("mouse");
        words.add("frog");
        words.add("dog");
        words.add("dog");
        
        WordList animals = new WordList(words);
        int numWords = animals.numWordsOfLength(4);
        int expected = 1;
        
        String msg = "Returned number: "+numWords+"\nCheck tester for expected result";
        assertTrue(msg, numWords==expected);
        
    }
    public void testA2()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("mouse");
        words.add("frog");
        words.add("dog");
        words.add("dog");
        
        WordList animals = new WordList(words);
        int numWords = animals.numWordsOfLength(3);
        int expected = 3;
        
        String msg = "Returned number: "+numWords+"\nCheck tester for expected result";
        assertTrue(msg, numWords==expected);
        
    }
    public void testA3()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("mouse");
        words.add("frog");
        words.add("dog");
        words.add("dog");
        
        WordList animals = new WordList(words);
        int numWords = animals.numWordsOfLength(2);
        int expected = 0;
        
        String msg = "Returned number: "+numWords+"\nCheck tester for expected result";
        assertTrue(msg, numWords==expected);
        
    }
   
    //Test Part B
    public void testB1()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("mouse");
        words.add("frog");
        words.add("dog");
        words.add("dog");
        
        WordList animals = new WordList(words);
        animals.removeWordsOfLength(4);
        
        ArrayList<String> actual = animals.getMyList();
        String[] expected = {"cat","mouse","dog","dog"};
        
        String msg = "Returned List: "+actual+"\nCheck tester for expected result";
        assertTrue(msg, listsMatch(actual,expected));
        
    }
    public void testB2()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("mouse");
        words.add("frog");
        words.add("dog");
        words.add("dog");
        
        WordList animals = new WordList(words);
        animals.removeWordsOfLength(4);
        animals.removeWordsOfLength(3);
        
        ArrayList<String> actual = animals.getMyList();
        String[] expected = {"mouse"};
        
        String msg = "Returned List: "+actual+"\nCheck tester for expected result";
        assertTrue(msg, listsMatch(actual,expected));
        
    }
    public void testB3()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("mouse");
        words.add("frog");
        words.add("dog");
        words.add("dog");
        
        WordList animals = new WordList(words);
        animals.removeWordsOfLength(4);
        animals.removeWordsOfLength(3);
        animals.removeWordsOfLength(2);
        
        ArrayList<String> actual = animals.getMyList();
        String[] expected = {"mouse"};
        
        String msg = "Returned List: "+actual+"\nCheck tester for expected result";
        assertTrue(msg, listsMatch(actual,expected));
        
    }
    
    public void testB4()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("mouse");
        words.add("frog");
        words.add("dog");
        words.add("dog");
        
        WordList animals = new WordList(words);
        animals.removeWordsOfLength(3);
        
        ArrayList<String> actual = animals.getMyList();
        String[] expected = {"mouse","frog"};
        
        String msg = "Returned List: "+actual+"\nCheck tester for expected result";
        assertTrue(msg, listsMatch(actual,expected));
        
    }
    public void testB5()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("mouse");
        words.add("frog");
        words.add("dog");
        words.add("dog");
        
        WordList animals = new WordList(words);
        animals.removeWordsOfLength(2);
        
        ArrayList<String> actual = animals.getMyList();
        String[] expected = {"cat","mouse","frog","dog","dog"};
        
        String msg = "Returned List: "+actual+"\nCheck tester for expected result";
        assertTrue(msg, listsMatch(actual,expected));
        
    }
    //helper methods for testing
    /**
     * check if the list of words matches the array of words
     */
    private boolean listsMatch(ArrayList<String> list, String[] arr)
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
