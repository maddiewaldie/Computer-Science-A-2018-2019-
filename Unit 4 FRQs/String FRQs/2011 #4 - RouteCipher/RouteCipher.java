/**
 * Write a description of class RouteCipher here.
 *
 * @author Madeleine Waldie
 * @version February 22, 2019
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
        int counter = 0; //Create a counter
        for (int a = 0; a < numRows; a++) //Go through the rows
        {
            for (int b = 0; b < numCols; b++) //Go through the columns
            {
                if (counter < str.length()) //If this is true, trailing characters are ignored
                {
                    letterBlock[a][b] = str.substring(counter, counter + 1);
                }
                else //A is placed into the unfilled cell
                {
                    letterBlock[a][b] = "A";
                }
                counter++; //Increase the counter
            }
        }
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
        String encryptedMessage = ""; //Instantiate a new, empty encrypted message string
        while (message.length() > 0) ///Go through message
        {
            int num = numRows * numCols; //Instantiate length of block
            if (num > message.length()) //If message block is smaller
            {
                num = message.length(); //Reassign length of block to message length
            }
            fillBlock(message.substring(0, num)); //fill block with necesarry block of message
            encryptedMessage += encryptBlock(); //encrypt the block
            message = message.substring(num); //Take out the block we just encrypted from message
        }
        return encryptedMessage; //Return the encrypted message
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
