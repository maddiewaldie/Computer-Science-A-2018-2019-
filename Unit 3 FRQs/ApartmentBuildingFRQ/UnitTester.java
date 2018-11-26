import junit.framework.*;
import java.util.ArrayList;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test Part A: Constructor
    public void testAddress()
    {
        String ad = "1234 Sesame Street";
        int num = 20;
        ApartmentBuilding a = new ApartmentBuilding( ad, num );
        String setAddress = a.getAddress();
        assertTrue(ad.equals(setAddress));
    }
    
    public void testWattHours1()
    {
        String ad = "1234 Sesame Street";
        int num = 0;
        ApartmentBuilding a = new ApartmentBuilding( ad, num );  
        double amount = a.amtOwed();
        assertTrue(amount==0);
    }
    public void testWattHours2()
    {
        String ad = "1234 Sesame Street";
        int num = 5;
        ApartmentBuilding a = new ApartmentBuilding( ad, num ); 
        double[] hours = {1,2,3,4,5};
        a.setApartmentHours(hours);
        double amount = a.amtOwed();
        assertTrue(amount==48.75);
    }
    public void testWattHours3()
    {
        String ad = "1234 Sesame Street";
        int num = 7;
        ApartmentBuilding a = new ApartmentBuilding( ad, num ); 
        double[] hours = {3,3,6,3,3,1,5};
        a.setApartmentHours(hours);
        double amount = a.amtOwed();
        assertTrue(amount==78);
    }
    
    //methods for testing - do not alter
    
}
