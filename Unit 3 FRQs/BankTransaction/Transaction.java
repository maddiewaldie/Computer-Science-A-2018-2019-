/**
 * The Transaction class will perform a Bank
 * Transaction of depositing or withdrawing money.
 * @author Madeleine Waldie
 * @version December 6, 2018
 */
public class Transaction
{
    private int accountNum;
    private double tAmnt;
    private String tType;
    
    /**
     * Transaction constructor
     */
    public Transaction(int accountNumber, String transactionType, double transactionAmnt)
    {
        accountNum = accountNumber;
        tType = transactionType;
        tAmnt = transactionAmnt;
    }
    
    /**
     * getAccountNumber Method - returns account number for the transaction
     */
    public int getAccountNumber()
    {
        return(accountNum);
    }
    
    /**
     * getTransactionType Method - returns type of transaction
     */
    public String getTransactionType()
    {
        return(tType);
    }
    
    /**
     * getTransactionAmount Method - returns amount of money involved in the transaction
     */
    public double getTransactionAmount()
    {
        return(tAmnt);
    }   
}
