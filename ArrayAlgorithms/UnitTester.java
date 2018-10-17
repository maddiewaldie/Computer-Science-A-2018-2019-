import junit.framework.*;
import java.util.ArrayList;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test findMax
    public void testMax1()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {5,2,6,9,2,10,3,6};
        int foundMax = a.findMax(array);
        int expectedMax = 10;
        
        assertTrue(foundMax==expectedMax);
    }
    public void testMax2()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {-3,-2,-7,-5,-1,-4};
        int foundMax = a.findMax(array);
        int expectedMax = -1;
        
        assertTrue(foundMax==expectedMax);
    }
    public void testMax3()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {5,5,5,5,5};
        int foundMax = a.findMax(array);
        int expectedMax = 5;
        
        assertTrue(foundMax==expectedMax);
    }
    
    //test findSum
    public void testSum1()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {5,2,6,9,2,10,3,6};
        int foundSum = a.findSum(array);
        int expectedSum = 43;
        
        assertTrue(foundSum==expectedSum);
    }
    public void testSum2()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {-3,-2,-7,-5,-1,-4};
        int foundSum = a.findSum(array);
        int expectedSum = -22;
        
        assertTrue(foundSum==expectedSum);
    }
    public void testSum3()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {5,5,5,5,5};
        int foundSum = a.findSum(array);
        int expectedSum = 25;
        
        assertTrue(foundSum==expectedSum);
    }
    
    //test isIncreasing
    public void testIncreasing1()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {3,4,5,3,7,1};
        boolean foundAns = a.isIncreasing(array);
        boolean expectedAns = false;
        
        assertTrue(foundAns==expectedAns);
    }
    public void testIncreasing2()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {1,2,3,4,5};
        boolean foundAns = a.isIncreasing(array);
        boolean expectedAns = true;
        
        assertTrue(foundAns==expectedAns);
    }
    public void testIncreasing3()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {5,5,5,5,5};
        boolean foundAns = a.isIncreasing(array);
        boolean expectedAns = false;
        
        assertTrue(foundAns==expectedAns);
    }
    
    //test findAverage
    public void testAverage1()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {5,2,7,-1,2};
        double foundAns = a.findAverage(array);
        double expectedAns = 3;
        
        assertTrue(foundAns==expectedAns);
    }
    public void testAverage2()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {4,1,7,9,3,10};
        double foundAns = a.findAverage(array);
        double expectedAns = 34.0/6;
        
        assertTrue(foundAns==expectedAns);
    }
    public void testAverage3()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {1};
        double foundAns = a.findAverage(array);
        double expectedAns = 1;
        
        assertTrue(foundAns==expectedAns);
    }
    
    //test allEven
    public void testEven1()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {1,3,7,5};
        boolean foundAns = a.allEven(array);
        boolean expectedAns = false;
        
        assertTrue(foundAns==expectedAns);
    }
    public void testEven2()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {1,4,7,3,78,9};
        boolean foundAns = a.allEven(array);
        boolean expectedAns = false;
        
        assertTrue(foundAns==expectedAns);
    }
    public void testEven3()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array = {2,6,10,8,24,12,10};
        boolean foundAns = a.allEven(array);
        boolean expectedAns = true;
        
        assertTrue(foundAns==expectedAns);
    }
    
    //test allMatch
    public void testMatch1()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array1 = {5,1,3,6,8};
        int[] array2 = {8,6,3,5,1};
        boolean foundAns = a.allMatch(array1, array2);
        boolean expectedAns = false;
        
        assertTrue(foundAns==expectedAns);
    }
    public void testMatch2()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        boolean foundAns = a.allMatch(array1, array2);
        boolean expectedAns = true;
        
        assertTrue(foundAns==expectedAns);
    }
    public void testMatch3()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4};
        boolean foundAns = a.allMatch(array1, array2);
        boolean expectedAns = false;
        
        assertTrue(foundAns==expectedAns);
    }
    public void testMatch4()
    {
        ArrayAlgorithms a = new ArrayAlgorithms();
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4,5,6};
        boolean foundAns = a.allMatch(array1, array2);
        boolean expectedAns = false;
        
        assertTrue(foundAns==expectedAns);
    }
}
