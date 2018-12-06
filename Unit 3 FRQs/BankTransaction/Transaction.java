/**
 * The Transaction class will perform a Bank
 * Transaction of depositing or withdrawing money.
 * 
 * @author Madeleine Waldie
 * @version December 6, 2018
 */
public class Transaction
{
    private int accountNum;
    private double tAmnt;
    private String tType;
    
    public Transaction(int accountNumber, String transactionType, double transactionAmnt)
    {
        accountNum = accountNumber;
        tType = transactionType;
        tAmnt = transactionAmnt;
    }
    
    public int getAccountNumber()
    {
        return(accountNum);
    }
    
    public String getTransactionType()
    {
        return(tType);
    }
    
    public double getTransactionAmount()
    {
        return(tAmnt);
    }   
}
