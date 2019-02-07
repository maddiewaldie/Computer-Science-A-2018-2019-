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
        double[] scanned = {0.3,0.7,0.8,0.4,1.4,1.1,0.2,0.5,0.1,1.6,0.6,0.9};
        SkyView view = new SkyView(4,3,scanned);
        double[][] actual = view.getView();
        
        double[][] expected = {{0.3, 0.7, 0.8},
                               {1.1, 1.4, 0.4},
                               {0.2, 0.5, 0.1},
                               {0.9, 0.6, 1.6}};
        
        String msg = "Returned View:\n"+view.toString()+"\n check tester for expected result";
        assertTrue(msg, viewsMatch(actual,expected));
    }
    
    public void testA2()
    {
        double[] scanned = {0.3,0.7,0.8,0.4,1.4,1.1};
        SkyView view = new SkyView(3,2,scanned);
        double[][] actual = view.getView();
        
        double[][] expected = {{0.3, 0.7},
                               {0.4, 0.8},
                               {1.4, 1.1}};
        
        String msg = "Returned View:\n"+view.toString()+"\n check tester for expected result";
        assertTrue(msg, viewsMatch(actual,expected));
    }
    
    //test part B
    public void testB1()
    {
        double[] scanned = {0.3,0.7,0.8,0.4,1.4,1.1,0.2,0.5,0.1,1.6,0.6,0.9};
        SkyView view = new SkyView(4,3,scanned);
        double average = view.getAverage(1,2,0,1);
        double expectedAverage = 0.8;
        
        
        String msg = "Returned Average:\n"+average+"\n check tester for expected result";
        assertTrue(msg, average==expectedAverage);
    }
    

    //helper methods for testing - DO NOT ALTER
    private boolean viewsMatch(double[][] actual, double[][] expected)
    {
        if(actual.length!=expected.length && actual[0].length!=expected[0].length)
        {
            return false;
        }
        for(int r=0; r<actual.length; r++)
        {
            for(int c=0; c<actual[0].length; c++)
            {
                if(actual[r][c]!=expected[r][c])
                {
                    return false;
                }
            }
        }
        return true;
    }
    
}
