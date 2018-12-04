/**
 * @author: (Your Name)
 * @version: (Date)
 * BankTransaction FRQ work
 * Use the FRQ question to work through the code
 * for this FRQ.
 * 
 */
public class Bank{
    //fields
    private BankAccount[] accounts;
    
    //constructor
    public Bank(BankAccount[] accts){
        accounts=accts;
    }
    
    //methods
    /**
     * precondition: acctNum is the number of an account in the
     * accounts array.
     * postcondition: returns the index in the accounts array of the
     * given account number. */
    private int getIndex (int accountNum)
    { 
        for(int i = 0; i < accounts.length; i++)
        {
            if(accounts[i].getAccountNum()==accountNum)
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * precondition: trans is a transaction for an account in the
     * accounts array.
     * postcondition: the account for trans has been modified to
     * reflect the change specified
     * by the transaction. */
    public void doOneTransaction ( Transaction trans )
    {
        //code to be implemented in part C
    }
}

