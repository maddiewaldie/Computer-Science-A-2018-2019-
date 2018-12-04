import junit.framework.*;
import java.util.ArrayList;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test BankAccount Code
    public void testAccount1()
    {
        BankAccount a = new BankAccount(1234,1212.45);
        int actualActNum = a.getAccountNum();
        double balance = a.getBalance();
        assertTrue(actualActNum==1234 && balance==1212.45);
    }
    public void testAccount2()
    {
        BankAccount a = new BankAccount(51327,5698.31);
        int actualActNum = a.getAccountNum();
        double balance = a.getBalance();
        assertTrue(actualActNum==51327 && balance==5698.31);
    }
    
    //test Transaction Code
    public void testTransactionAcctNum()
    {
        Transaction t = new Transaction(1234, "d", 321.50);
        int actualActNum = t.getAccountNumber();
        assertTrue(actualActNum==1234);
    }
    public void testTransactionType()
    {
        Transaction t = new Transaction(1234, "d", 321.50);
        String actualTransactionType = t.getTransactionType();
        assertTrue(actualTransactionType.equals("d"));
    }
    public void testTransactionAmount()
    {
        Transaction t = new Transaction(1234, "d", 321.50);
        double actualTransactionAmount = t.getTransactionAmount();
        assertTrue(actualTransactionAmount == 321.50);
    }
   
    //test ATMTransaction code
    public void testATMSuperClass()
    {
        ATMTransaction t = new ATMTransaction(1234, "d", 321.50, "111 Sesame Street, San Jose");
        String superclass = t.getClass().getSuperclass().toString();
        System.out.println(superclass);
        assertTrue(superclass.equals("class Transaction"));
    }
    public void testATMLocation()
    {
        ATMTransaction t = new ATMTransaction(1234, "d", 321.50, "111 Sesame Street, San Jose");
        String actualLocation = t.getATMLocation();
        assertTrue(actualLocation.equals("111 Sesame Street, San Jose"));
    }
    
    //test Bank code
    public void testWithdrawal1()
    {
        BankAccount[] allActs = new BankAccount[4];
        allActs[0] = new BankAccount( 123456789, 500.50 );
        allActs[1] = new BankAccount( 234567890, 200.30 );
        allActs[2] = new BankAccount( 987654321, 100.50 );
        allActs[3] = new BankAccount( 876543210, 9000.50 );
        
        Bank theBank = new Bank(allActs);
        
        Transaction transaction = new Transaction(987654321, "w", 50.00);
        theBank.doOneTransaction(transaction);
        
        double[] expectedAmts = {500.50, 200.30, 50.50, 9000.50};
        
        checkAccounts(allActs, expectedAmts);
    }
    public void testWithdrawal2()
    {
        BankAccount[] allActs = new BankAccount[4];
        allActs[0] = new BankAccount( 123456789, 500.50 );
        allActs[1] = new BankAccount( 234567890, 200.30 );
        allActs[2] = new BankAccount( 987654321, 100.50 );
        allActs[3] = new BankAccount( 876543210, 9000.50 );
        
        Bank theBank = new Bank(allActs);
        
        Transaction transaction = new Transaction(876543210, "w", 350.00);
        theBank.doOneTransaction(transaction);
        
        double[] expectedAmts = {500.50, 200.30, 100.50, 8650.50};
        
        checkAccounts(allActs, expectedAmts);
    }
    public void testDeposit1()
    {
        BankAccount[] allActs = new BankAccount[4];
        allActs[0] = new BankAccount( 123456789, 500.50 );
        allActs[1] = new BankAccount( 234567890, 200.30 );
        allActs[2] = new BankAccount( 987654321, 100.50 );
        allActs[3] = new BankAccount( 876543210, 9000.50 );
        
        Bank theBank = new Bank(allActs);
        
        Transaction transaction = new Transaction(234567890, "d", 725.10);
        theBank.doOneTransaction(transaction);
        
        double[] expectedAmts = {500.50, 925.40, 100.50, 9000.50};
        
        checkAccounts(allActs, expectedAmts);
    }
    public void testDeposit2()
    {
        BankAccount[] allActs = new BankAccount[4];
        allActs[0] = new BankAccount( 123456789, 500.50 );
        allActs[1] = new BankAccount( 234567890, 200.30 );
        allActs[2] = new BankAccount( 987654321, 100.50 );
        allActs[3] = new BankAccount( 876543210, 9000.50 );
        
        Bank theBank = new Bank(allActs);
        
        Transaction transaction = new Transaction(123456789, "d", 31.62);
        theBank.doOneTransaction(transaction);
        
        double[] expectedAmts = {532.12, 200.30, 100.50, 9000.50};
        
        checkAccounts(allActs, expectedAmts);
    }
    
    
    
    //method for testing - Do not alter
    private boolean checkAccounts(BankAccount[] acts, double[] expected)
    {
        if(acts.length!=expected.length)
        {
            return false;
        }
        for(int i=0; i<acts.length; i++)
        {
            if(acts[i].getBalance()!=expected[i])
            {
                return false;
            }
        }
        return true;
    }
}
