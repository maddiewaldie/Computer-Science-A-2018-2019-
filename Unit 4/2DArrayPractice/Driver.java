import java.util.*;

/**
 * Write a description of class Driver here.
 *
 * @author Madeleine Waldie
 * @version February 5, 2019
 */
public class Driver
{
    public static void main(String[] args)
    {
        //Initialize arrays
        //int[][] myNums = new int[3][2]; //empty
        int[][] myNums = {{1, 2}, {3, 4}, {5, 6}}; //filled
        
        //Get number of rows & columns
        int numRows = myNums.length;
        int numColumns = myNums[0].length;
        System.out.println("Rows: " + numRows + ", Columns: " + numColumns);
        System.out.print("\n");
        //Print out 2D array w/ regular for loop
        System.out.println("myNums: " + myNums); //Prints memory location
        System.out.print("\n");
        System.out.println("myNums: ");
        for (int a = 0; a < myNums.length; a++)
        {
            for(int b = 0; b < myNums[a].length; b++)
            {
                 System.out.print(myNums[a][b] + " ");
            }
            System.out.println("");
        }
        System.out.print("\n");
        
        //Print out 2D array w/ enhanced for loop
        System.out.println("myNums: ");
        for(int[] tempA : myNums)
        {
            for(int tempB : tempA)
            {
                System.out.print(tempB + " ");
            }
            System.out.print("\n");
        }
        
        //Calculate avg of values in 2d array & print avg
        double sum = 0;
        int counter = 0;
        double avg = 0;
        for(int[] tempA : myNums)
        {
            for(int tempB : tempA)
            {
                sum+=tempB;
                counter ++;
            }
        }
        avg = (sum/counter);
        System.out.print("\n");
        System.out.println("Avg: " + avg);
        
        //Create a transpose of myNums
        int[][] transpose = new int[myNums.length][myNums[0].length]; //empty
        System.out.print("\n");
        System.out.println("transpose:");
        if (myNums.length > 0) {
            //Fill transpose
            for (int a = 0; a < myNums[0].length; a++) {
                for (int b = 0; b < myNums.length; b++) {
                    transpose[b][a] = myNums[b][a];
                    System.out.print(transpose[b][a] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
