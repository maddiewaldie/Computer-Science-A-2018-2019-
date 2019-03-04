import junit.framework.*;
import java.util.*;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test Warmup 3/4/19
    public void test1()
    {
        String phrase = "Mary had a little lamb.";
        StringWarmup warmup = new StringWarmup();
        int numWords = warmup.countWords(phrase);
        
        int expected = 5;
        String msg = "Actual count: "+numWords+"\nExpected count: "+expected;
        assertTrue(msg, numWords==expected);
    }
    
    public void test2()
    {
        String phrase = " The cat in the hat   that";
        StringWarmup warmup = new StringWarmup();
        int numWords = warmup.countWords(phrase);
        
        int expected = 6;
        String msg = "Actual count: "+numWords+"\nExpected count: "+expected;
        assertTrue(msg, numWords==expected);
    }
    
    public void test3()
    {
        String phrase = "randomwordsjumbledtogether";
        StringWarmup warmup = new StringWarmup();
        int numWords = warmup.countWords(phrase);
        
        int expected = 1;
        String msg = "Actual count: "+numWords+"\nExpected count: "+expected;
        assertTrue(msg, numWords==expected);
    }
    
    public void test4()
    {
        String phrase = "";
        StringWarmup warmup = new StringWarmup();
        int numWords = warmup.countWords(phrase);
        
        int expected = 0;
        String msg = "Actual count: "+numWords+"\nExpected count: "+expected;
        assertTrue(msg, numWords==expected);
    }
    
    public void test5()
    {
        String phrase = " ";
        StringWarmup warmup = new StringWarmup();
        int numWords = warmup.countWords(phrase);
        
        int expected = 5;
        String msg = "Actual count: "+numWords+"\nExpected count: "+expected;
        assertTrue(msg, numWords==expected);
    }
    
    //come up with 3 test cases that test for special edge cases
}
