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
        
        //Print out 2d array
        System.out.println("myNums: " + myNums); //Prints memory location
        System.out.print("myNums: ");
        for (int a = 0; a < myNums.length; a++)
        {
            for(int b = 0; b < myNums[a].length; b++)
            {
                 System.out.print(myNums[a][b] + " ");
            }
        }
        System.out.println();
    }
}
