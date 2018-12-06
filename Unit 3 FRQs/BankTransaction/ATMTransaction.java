/**
 * ATMTransaction Class
 * @author Madeleine Waldie
 * @version December 6, 2018
 */
public class ATMTransaction extends Transaction
{
    String loc;

    /*
     * ATMTransaction constructor
     */
    public ATMTransaction(int accountNumber, String transactionType, double transactionAmnt, String location)
    {
        super(accountNumber, transactionType, transactionAmnt);
        loc = location;
    }
    
    /*
     * getATMLocation method - returns the location of the ATM
     */
    public String getATMLocation()
    {
        return(loc);
    }
}
