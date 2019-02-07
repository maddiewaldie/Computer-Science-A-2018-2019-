
/**
 * Write a description of class SparseArrayEntry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SparseArrayEntry
{
    /** The row index and column index for this entry in the sparse array */ 
    private int row; 
    private int col;

    /** The value of this entry in the sparse array */ 
    private int value;

    /** Constructs a SparseArrayEntry object that represents a sparse array element
     * with row index r and column index c, containing value v. */ 
    public SparseArrayEntry(int r, int c, int v) 
    {
        row = r; 
        col = c; 
        value = v; 
    }

    /** Returns the row index of this sparse array element. */ 
    public int getRow() 
    { 
        return row; 
    }

    /** Returns the column index of this sparse array element. */ 
    public int getCol() 
    { 
        return col; 
    }

    /** Returns the value of this sparse array element. */ 
    public int getValue() 
    { 
        return value; 
    } 
    
    //methods for testing - DO NOT ALTER
    public String toString()
    {
        String temp="{row: "+row+"; col: "+col+"; value: "+value+"}";
        return temp;
    }
    public boolean equals(Object other)
    {
        SparseArrayEntry entry = (SparseArrayEntry)(other);
        return (row==entry.getRow()&&col==entry.getCol()&&value==entry.getValue());
    }
}
