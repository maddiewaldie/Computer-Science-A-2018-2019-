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
        int rows = 3;
        int cols = 5;
        String str = "Meet at noon";
        
        RouteCipher cipher = new RouteCipher(rows, cols);
        cipher.fillBlock(str);
        String[][] actual = cipher.getLetterBlock();
        String[][] expected = {{"M","e","e","t"," "},{"a","t"," ","n","o"},{"o","n","A","A","A"}};
        
        String msg = "LetterBlock:\n"+cipher.printLetterBlock()+"\n check tester for expected result";
        assertTrue(msg, blocksMatch(actual,expected));
    }
    public void testA2()
    {
        int rows = 3;
        int cols = 5;
        String str = "Meet at midnight";
        
        RouteCipher cipher = new RouteCipher(rows, cols);
        cipher.fillBlock(str);
        String[][] actual = cipher.getLetterBlock();
        String[][] expected = {{"M","e","e","t"," "},{"a","t"," ","m","i"},{"d","n","i","g","h"}};
        
        String msg = "LetterBlock: "+cipher.printLetterBlock()+"\n check tester for expected result";
        assertTrue(msg, blocksMatch(actual,expected));
    }
    
    //test Part B
    public void testB1()
    {
        int rows = 2;
        int cols = 3;
        String str = "Meet at midnight";
        
        RouteCipher cipher = new RouteCipher(rows, cols);
        String actual = cipher.encryptMessage(str);
        String expected = "Mte eati dmnitgAhA";
        
        String msg = "Returned encryption: "+actual+"\nCheck tester for expected result";
        assertTrue(msg, actual.equals(expected));
    }

    //helper methods for testing - DO NOT ALTER
    private boolean blocksMatch(String[][] actual, String[][] expected)
    {
        if(actual.length!=expected.length && actual[0].length!=expected[0].length)
        {
            return false;
        }
        for(int r=0; r<actual.length; r++)
        {
            for(int c=0; c<actual[r].length; c++)
            {
                if(!actual[r][c].equals(expected[r][c]))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
