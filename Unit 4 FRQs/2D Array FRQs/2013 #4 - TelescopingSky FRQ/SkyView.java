
/**
 * SkyView Class.
 *
 * @author Madeleine Waldie
 * @version February 7, 2019
 */
public class SkyView
{
    private double[][] view; 
    //A rectangular array that holds the data representing a rectangular area of the sky

    /**
     * Constructs a SkyView object from a 1-dimensional array of scan data
     * @param numRows the number of rows represented in the view
     *   Precondition: numRows > 0
     * @param numCols the number of columns represented in the view
     *   Precondition: numCols > 0
     * @param scanned the scan data received from the telescope, stored
     * in telescope order created as a rectangular 2-dimensional array with numRows
     * rows and numCols columns and the values in scanned have have been
     * copied to view and are ordered as in the original rectangular area
     * of the sky
     */
    public SkyView (int numRows, int numCols, double[] scanned)
    {
        //Set size of view
        view = new double[numRows][numCols];

        //Initialize amnt of rows & columns
        int rows = 0;
        int columns = 0;

        //Go through scanned & set amnt of rows & columns
        for (double temp : scanned)
        {
            view[rows][columns] = temp;
            int nextColumn = columns;
            if (rows % 2 == 0)
            {
                nextColumn++;
            }
            else
            {
                nextColumn--;
            }
            if ((nextColumn >= 0) && (nextColumn < numCols))
            {
                columns = nextColumn;
            }
            else
            {
                rows++;
            }
        }
    }

    /**
     * Returns the average of the values in a rectangular section of view
     * @param startRow the first row index of the section
     * @param endRow the last row index of the section
     * @param startCol the first column index of the section
     * @param endCol the last column index of the section
     *   Precondition: 0 <= startRow <= endRow < view.length
     *   Precondition: 0 <= startCol <= endCol < view(0)..length
     * @return the average of the values in the specified section of view
     */
    public double getAverage( int startRow, int endRow, int startCol, int endCol)
    {
        int r = endRow - startRow + 1; //number of rows in section
        int c = endCol - startCol + 1; //number of columns in section
        double sum = 0.0;
        
        //Go through section
        for(int a = startRow; a <= endRow; a++)
        {
            for(int b = startCol; b <= endCol; b++)
            {
                sum+= view[a][b];
            }
        }
        
        //Return average
        return(sum/(r*c));
    }

    //There may be instance variables, constructors, and methods that are not shown

    //methods for testing - DO NOT ALTER
    public double[][] getView()
    {
        return view;
    }

    public String toString()
    {
        String temp="";
        for(double[] rows:view)
        {
            for(double value:rows)
            {
                temp+=value;
                temp+="\t";
            }
            temp+="\n";
        }
        return temp;
    }
}
