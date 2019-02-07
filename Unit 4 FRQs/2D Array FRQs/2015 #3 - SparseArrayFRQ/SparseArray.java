import java.util.*;
/**
 * Write a description of class SparseArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SparseArray
{
    /** 
     * The number of rows and columns in the sparse array. 
     */ 
    private int numRows; 
    private int numCols;

    /** 
     * The list of entries representing the non-zero elements of the sparse array. Entries are stored in the
     * list in no particular order. Each non-zero element is represented by exactly one entry in the list. 
     */ 
    private List<SparseArrayEntry> entries;

    /** Constructs an empty SparseArray. */
    public SparseArray() 
    { 
        entries = new ArrayList<SparseArrayEntry>(); 
    }

    /** 
     * Returns the number of rows in the sparse array. 
     */ 
    public int getNumRows() 
    { 
        return numRows; 
    }

    /** 
     * Returns the number of columns in the sparse array. 
     */
    public int getNumCols()
    { 
        return numCols; 
    }

    /** 
     * Returns the value of the element at row index row and column index col in the sparse array.
     * Precondition: 0 < row < getNumRows() 
     *	            0 < col < getNumCols() 
     */ 
    public int getValueAt(int row, int col) 
    { 
        /* to be implemented in part (a) */ 
    }

    /** 
     * Removes the column col from the sparse array. 
     * Precondition: 0 < col < getNumCols() 
     */ 
    public void removeColumn(int col) 
    { 
        /* to be implemented in part (b) */ 
    }
    
    // There may be instance variables, constructors, and methods that are not shown.

    //methods for testing - DO NOT ALTER
    public String toString()
    {
        String temp="numRows: "+numRows+"\n"+"numCols: "+numCols+"\n";
        for(SparseArrayEntry entry:entries)
        {
            temp+=entry.toString();
        }
        return temp;
    }
    public SparseArray(int rows, int cols, ArrayList<SparseArrayEntry> values)
    {
        numRows = rows;
        numCols = cols;
        entries = values;
    }
    public List<SparseArrayEntry> getEntries()
    {
        return entries;
    }
}
