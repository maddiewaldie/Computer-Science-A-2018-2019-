/**
 * The BankAccount class represents one Bank Account
 * held by a Bank customer.  It has an account number
 * and an account balance.
 * 
 * @author (Melanie Duffin) 
 */
public class BankAccount
{
    //fields
    private int accountNum;
    private double balance;

    //constructor
    public BankAccount( int act, double bal )
    {
        //complete the constructor here
    }
    
    //methods
    /**
     * returns the account number
     */
    public int getAccountNum( ) 
    {
        return accountNum; 
    }
    
    /**
     * returns the current balance - 
     * how much money is in the account
     */
    public double getBalance ( ) 
    {  
        return balance; 
    }

    /**
     * adds the given amount to the current balance
     */
    public void doDeposit (double amount ) 
    { 
        balance += amount; 
    }

    /**
     * subtracts the given amount from the current balance
     */
    public void doWithdrawal ( double amount ) 
    { 
        balance -= amount; 
    }

}
