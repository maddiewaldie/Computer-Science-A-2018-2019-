import junit.framework.*;
import java.util.ArrayList;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test methods
    public void testSuperclass()
    {
        Vehicle v = new Vehicle(30000, 5000, .15);   
        String superclass = v.getClass().getSuperclass().toString();
        assertTrue(superclass.equals("class TaxableItem"));
    }
    public void testgetListPrice1()
    {
        Vehicle v = new Vehicle(30000, 5000, .15);
        double actualListPrice = v.getListPrice();
        assertTrue(actualListPrice==35000);
    }
    public void testgetListPrice2()
    {
        Vehicle v = new Vehicle(20000.00, 2500.00, .10);
        double actualListPrice = v.getListPrice();
        assertTrue(actualListPrice==22500.00);
    }
    
    public void testpurchasePrice()
    {
        Vehicle v = new Vehicle(20000.00, 2500.00, .10);
        double actualPurchasePrice = v.purchasePrice();
        assertTrue(Math.round(actualPurchasePrice*100)/100==24750.00);
    }
    
    public void testDealerMarkup1()
    {
        Vehicle v = new Vehicle(20000.00, 2500.00, .10);
        v.changeMarkup(1000);
        double actualListPrice = v.getListPrice();
        assertTrue(actualListPrice==21000.00);
    }
    public void testDealerMarkup2()
    {
        Vehicle v = new Vehicle(20000.00, 2500.00, .10);
        v.changeMarkup(1000);
        double actualListPrice = v.purchasePrice();
        assertTrue(Math.round(actualListPrice*100)/100==23100.00);
    }
    
}
    
    
