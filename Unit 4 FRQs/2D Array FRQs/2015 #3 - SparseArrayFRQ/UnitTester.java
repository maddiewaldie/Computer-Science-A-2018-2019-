import junit.framework.*;
import java.util.*;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test Part A
    public void testA1()
    {
        SparseArrayEntry e1 = new SparseArrayEntry(1,4,4);
        SparseArrayEntry e2 = new SparseArrayEntry(2,0,1);
        SparseArrayEntry e3 = new SparseArrayEntry(3,1,-9);
        SparseArrayEntry e4 = new SparseArrayEntry(1,1,5);
        ArrayList<SparseArrayEntry> entries = new ArrayList<SparseArrayEntry>();
        entries.add(e1);
        entries.add(e2);
        entries.add(e3);
        entries.add(e4);
        
        SparseArray sparse = new SparseArray(6,5,entries);
        int value = sparse.getValueAt(3,1);
        int expectedValue = -9;
        
        String msg = "Returned Value:\n"+value+"\n check tester for expected result";
        assertTrue(msg, value==expectedValue);
    }
    
    public void testA2()
    {
        SparseArrayEntry e1 = new SparseArrayEntry(1,4,4);
        SparseArrayEntry e2 = new SparseArrayEntry(2,0,1);
        SparseArrayEntry e3 = new SparseArrayEntry(3,1,-9);
        SparseArrayEntry e4 = new SparseArrayEntry(1,1,5);
        ArrayList<SparseArrayEntry> entries = new ArrayList<SparseArrayEntry>();
        entries.add(e1);
        entries.add(e2);
        entries.add(e3);
        entries.add(e4);
        
        SparseArray sparse = new SparseArray(6,5,entries);
        
        int value = sparse.getValueAt(3,3);
        int expectedValue = 0;
        
        String msg = "Returned Value:\n"+value+"\n check tester for expected result";
        assertTrue(msg, value==expectedValue);
    }
    
    //test part B
    public void testB1()
    {
        SparseArrayEntry e1 = new SparseArrayEntry(1,4,4);
        SparseArrayEntry e2 = new SparseArrayEntry(2,0,1);
        SparseArrayEntry e3 = new SparseArrayEntry(3,1,-9);
        SparseArrayEntry e4 = new SparseArrayEntry(1,1,5);
        ArrayList<SparseArrayEntry> entries = new ArrayList<SparseArrayEntry>();
        entries.add(e1);
        entries.add(e2);
        entries.add(e3);
        entries.add(e4);
        
        SparseArray sparse = new SparseArray(6,5,entries);
        sparse.removeColumn(1);
        int actualRows = sparse.getNumRows();
        int actualCols = sparse.getNumCols();
        List<SparseArrayEntry> actualEntries = sparse.getEntries();
        
        int expectedRows = 6;
        int expectedCols = 4;
        SparseArrayEntry expected1 = new SparseArrayEntry(1,3,4);
        SparseArrayEntry expected2 = new SparseArrayEntry(2,0,1);
        ArrayList<SparseArrayEntry> expectedEntries = new ArrayList<SparseArrayEntry>();
        expectedEntries.add(expected1);
        expectedEntries.add(expected2);
        
        
        
        String msg = sparse.toString()+"\n check tester for expected result";
        assertTrue(msg, contains(actualEntries, expectedEntries) && actualRows==expectedRows && actualCols==expectedCols);
    }
    

    //helper methods for testing - DO NOT ALTER
    private boolean contains(List<SparseArrayEntry> actual, ArrayList<SparseArrayEntry> expected)
    {
        if(actual.size()!=expected.size())
        {
            return false;
        }
        for(SparseArrayEntry s:actual)
        {
            if(!expected.contains(s))
            {
                return false;
            }
        }
        return true;
    }
    
}
