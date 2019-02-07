
/**
 * Write a description of class SkyView here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        /* to be implemented in part (a) */
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
        /* to be implemented in part (b) */
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
