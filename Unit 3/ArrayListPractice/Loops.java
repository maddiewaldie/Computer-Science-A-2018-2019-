//imports
import java.util.ArrayList;

/**
 * Loops Class
 *
 * @author Madeleine Waldie
 * @version December 10, 2018
 */
public class Loops
{
    public static void main(String[] args)
    {
        //instantiate variables
        int[] myNums = {1, 9, 5, 3, 8, 7}; //regular array
        ArrayList<Integer> myNumsAL = new ArrayList<Integer>(); //array list --> can only add objects one by one; can only use non-primitice data types
        ArrayList<String> myWords = new ArrayList<String>();
        int sumRegular = 0;
        int sumEnhanced = 0;
        
        //use regular for loop to find the sum
        for(int i = 0; i < myNums.length; i++)
        {
            sumRegular += myNums[i];
        }
        System.out.println("sumRegular = " + sumRegular);
        
        //use enhanced for loop to find the sum
        for(int i : myNums)
        {
            sumEnhanced += i;
        }
        System.out.println("sumEnhanced = " + sumEnhanced);
    }
}