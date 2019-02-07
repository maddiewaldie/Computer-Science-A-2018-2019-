
/**
 * Write a description of class RouteCipher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RouteCipher
{
    /*
     * A two-dimensional array of single-character strings,
     * instantiated in the constructor
     */
    private String[][] letterBlock;
    
    /*
     * The number of rows of letterBlock, set by the constructor
     */
    private int numRows;
    
    /*
     * The number of columns of letterBlock, set by the constructor
     */
    private int numCols;
    
    /**
     * Places a string into letterBlock in row-major order
     * @param str the string to be processed
     * Postcondition:
     *   if str.length() < numRows * numCols, "A" is placed in each unfilled cell
     *   if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str)
    {
        /* to be implemented in part (a) */
    }
    
    /**
     * Extracts encrypted string from letterBlock in column-major order
     * Precondition: letterBlock has been filled
     * @return the encrypted string from letterBlock
     */
    private String encryptBlock()
    {
        //implementation not shown in FRQ
        //DO NOT ALTER
        String temp = "";
        for(int c=0; c<letterBlock[0].length; c++)
        {
            for(int r=0; r<letterBlock.length; r++)
            {
                temp+=letterBlock[r][c];
            }
        }
        return temp;
    }
    
    /**
     * Encrypts a message
     * @param message the string to be encrypted
     * @return the encrypted message;
     *   if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message)
    {
        /*to be implemented in part (b)*/
    }
    
    
    //constructor and methods for testing - DO NOT ALTER
    public RouteCipher(int rows, int cols)
    {
        numRows = rows;
        numCols = cols;
        letterBlock = new String[rows][cols];
    }
    
    public String printLetterBlock()
    {
        String temp="";
        for(int r=0; r<letterBlock.length; r++)
        {
            for(int c=0; c<letterBlock[r].length; c++)
            {
                String entry = "\""+letterBlock[r][c]+"\"\t";
                temp+=entry;
            }
            temp+="\n";
        }
        return temp;
    }
    
    public String[][] getLetterBlock()
    {
        return letterBlock;
    }
    //There may be instance variables, constructors, and methods that are not shown
}
