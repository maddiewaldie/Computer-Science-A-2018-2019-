import junit.framework.*;
import java.util.ArrayList;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test Part A: forwardMoveBlocked
    public void testA1()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        assertTrue(r.forwardMoveBlocked()==false);
    }
    public void testA2()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 0, true);
        assertTrue(r.forwardMoveBlocked()==false);
    }
    public void testA3()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 0, false);
        assertTrue(r.forwardMoveBlocked()==true);
    }
    public void testA4()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 3, false);
        assertTrue(r.forwardMoveBlocked()==false);
    }
    public void testA5()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 3, true);
        assertTrue(r.forwardMoveBlocked()==true);
    }
    
    
    //test Part B: move
    public void testB1()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        r.move();
        
        int[] currentHall = r.getHall();
        int[] expectedHall = {1,0,2,2};
        boolean dir = r.getDirection();
        boolean expectedDir = true;
        int pos = r.getPosition();
        int expectedPos = 2;
        
        assertTrue(checkHallState(currentHall, expectedHall)&&checkRobot(dir, expectedDir, pos, expectedPos));
        
    }
    
    public void testB2()
    {
        
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        for(int count=0; count<2;count++)
        {
            r.move();
        }
        
        int[] currentHall = r.getHall();
        int[] expectedHall = {1,0,1,2};
        boolean dir = r.getDirection();
        boolean expectedDir = true;
        int pos = r.getPosition();
        int expectedPos = 2;
        
        assertTrue(checkHallState(currentHall, expectedHall)&&checkRobot(dir, expectedDir, pos, expectedPos));
        
    }
    
    public void testB3()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        for(int count=0; count<3;count++)
        {
            r.move();
        }
        int[] currentHall = r.getHall();
        int[] expectedHall = {1,0,0,2};
        boolean dir = r.getDirection();
        boolean expectedDir = true;
        int pos = r.getPosition();
        int expectedPos = 3;
        
        assertTrue(checkHallState(currentHall, expectedHall)&&checkRobot(dir, expectedDir, pos, expectedPos));
         
        
    }
    public void testB4()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        for(int count=0; count<4;count++)
        {
            r.move();
        }
        int[] currentHall = r.getHall();
        int[] expectedHall = {1,0,0,1};
        boolean dir = r.getDirection();
        boolean expectedDir = true;
        int pos = r.getPosition();
        int expectedPos = 3;
        
        assertTrue(checkHallState(currentHall, expectedHall)&&checkRobot(dir, expectedDir, pos, expectedPos));
         
        
    }
    public void testB5()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        for(int count=0; count<5;count++)
        {
            r.move();
        }
        int[] currentHall = r.getHall();
        int[] expectedHall = {1,0,0,0};
        boolean dir = r.getDirection();
        boolean expectedDir = false;
        int pos = r.getPosition();
        int expectedPos = 3;
        
        assertTrue(checkHallState(currentHall, expectedHall)&&checkRobot(dir, expectedDir, pos, expectedPos));
         
        
    }
    public void testB6()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        for(int count=0; count<6;count++)
        {
            r.move();
        }
        int[] currentHall = r.getHall();
        int[] expectedHall = {1,0,0,0};
        boolean dir = r.getDirection();
        boolean expectedDir = false;
        int pos = r.getPosition();
        int expectedPos = 2;
        
        assertTrue(checkHallState(currentHall, expectedHall)&&checkRobot(dir, expectedDir, pos, expectedPos));
         
        
    }
    public void testB7()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        for(int count=0; count<7;count++)
        {
            r.move();
        }
        int[] currentHall = r.getHall();
        int[] expectedHall = {1,0,0,0};
        boolean dir = r.getDirection();
        boolean expectedDir = false;
        int pos = r.getPosition();
        int expectedPos = 1;
        
        assertTrue(checkHallState(currentHall, expectedHall)&&checkRobot(dir, expectedDir, pos, expectedPos));
         
        
    }
    public void testB8()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        for(int count=0; count<8;count++)
        {
            r.move();
        }
        int[] currentHall = r.getHall();
        int[] expectedHall = {1,0,0,0};
        boolean dir = r.getDirection();
        boolean expectedDir = false;
        int pos = r.getPosition();
        int expectedPos = 0;
        
        assertTrue(checkHallState(currentHall, expectedHall)&&checkRobot(dir, expectedDir, pos, expectedPos));
         
        
    }
    public void testB9()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        for(int count=0; count<9;count++)
        {
            r.move();
        }
        int[] currentHall = r.getHall();
        int[] expectedHall = {0,0,0,0};
        boolean dir = r.getDirection();
        boolean expectedDir = true;
        int pos = r.getPosition();
        int expectedPos = 0;
        
        assertTrue(checkHallState(currentHall, expectedHall)&&checkRobot(dir, expectedDir, pos, expectedPos));
         
        
    }
    
    //Test Part C: clearHall
    public void testC1()
    {
        int[] hall = {1,1,2,2};
        Robot r = new Robot(hall, 1, true);
        int total = r.clearHall();
        assertTrue(total==9);
    }
    public void testC2()
    {
        int[] hall = {1,1,2,2,1};
        Robot r = new Robot(hall, 0, false);
        int total = r.clearHall();
        assertTrue(total==8);
    }
    public void testC3()
    {
        int[] hall = {1,1,2,2,1};
        Robot r = new Robot(hall, 2, false);
        int total = r.clearHall();
        assertTrue(total==10);
    }
    
    
    //helper methods - do not modify
    private boolean checkHallState( int[] current, int[] expected)
    {
        if(current.length!=expected.length)
        {
            return false;
        }
        for(int i=0; i<current.length; i++)
        {
            if(current[i]!=expected[i])
            {
                return false;
            }
        }
        return true;
    }
    private boolean checkRobot(boolean dir, boolean expectedDir, int pos, int expectedPos)
    {
        return (dir==expectedDir)&&(pos==expectedPos);
    }
}
