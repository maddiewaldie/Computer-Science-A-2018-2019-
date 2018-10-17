import junit.framework.*;
import java.util.ArrayList;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test Part A: average
    public void testA1()
    {
        int[] scores={50,50,20,80,53};
        StudentRecord s = new StudentRecord(scores);
        double avg = s.average(1,3);
        assertTrue(avg == 50);
    }
    public void testA2()
    {
        int[] scores={50,50,20,80,53};
        StudentRecord s = new StudentRecord(scores);
        double avg = s.average(1,4);
        assertTrue(avg == 50.75);
    }
    public void testA3()
    {
        int[] scores={50,50,20,80,53};
        StudentRecord s = new StudentRecord(scores);
        double avg = s.average(0,1);
        assertTrue(avg == 50);
    }
    public void testA4()
    {
        int[] scores={50,50,20,80,53};
        StudentRecord s = new StudentRecord(scores);
        double avg = s.average(0,2);
        assertTrue(avg == 40);
    }
    
    public void testA5()
    {
        int[] scores={50,50,20,80,53};
        StudentRecord s = new StudentRecord(scores);
        double avg = s.average(0,4);
        assertTrue(avg == 50.6);
    }

    //Test part B: hasImproved
    public void testB1()
    {
        int[] scores={50,50,20,80,53};
        StudentRecord s = new StudentRecord(scores);
        boolean improved = s.hasImproved();
        assertTrue(improved==false);
    }
    public void testB2()
    {
        int[] scores={20,50,50,53,80};
        StudentRecord s = new StudentRecord(scores);
        boolean improved = s.hasImproved();
        assertTrue(improved==true);
    }
    public void testB3()
    {
        int[] scores={20,50,50,80};
        StudentRecord s = new StudentRecord(scores);
        boolean improved = s.hasImproved();
        assertTrue(improved==true);
    }
    
    //test Part C: finalAverage
    public void testC1()
    {
        int[] scores={50,50,20,80,53};
        StudentRecord s = new StudentRecord(scores);
        double value = s.finalAverage();
        assertTrue(value==50.6);
    }
    public void testC2()
    {
        int[] scores={20,50,50,53,80};
        StudentRecord s = new StudentRecord(scores);
        double value = s.finalAverage();
        assertTrue(value==61.0);
    }
    public void testC3()
    {
        int[] scores={20,50,50,80};
        StudentRecord s = new StudentRecord(scores);
        double value = s.finalAverage();
        assertTrue(value==65.0);
    }
}
