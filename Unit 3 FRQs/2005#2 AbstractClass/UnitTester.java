import junit.framework.*;
import java.util.ArrayList;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    
    public void testA1()
    {
        Advance a = new Advance(10);
        a.setSerialNumber(357);
        double price = a.getPrice();
        assertTrue(price==30);
    }
    public void testA2()
    {
        Advance a = new Advance(20);
        a.setSerialNumber(125);
        double price = a.getPrice();
        assertTrue(price == 30);
    }
    public void testA3()
    {
        Advance a = new Advance(5);
        a.setSerialNumber(431);
        double price = a.getPrice();
        assertTrue(price == 40);
    }
    
    public void testB1()
    {
        StudentAdvance a = new StudentAdvance(10);
        a.setSerialNumber(357);
        double price = a.getPrice();
        assertTrue(price == 15);
    }
    public void testB2()
    {
        StudentAdvance a = new StudentAdvance(20);
        a.setSerialNumber(125);
        double price = a.getPrice();
        assertTrue(price == 15);
    }
    public void testB3()
    {
        StudentAdvance a = new StudentAdvance(5);
        a.setSerialNumber(431);
        double price = a.getPrice();
        assertTrue(price == 20);
    }
    public void testB4()
    {
        StudentAdvance a = new StudentAdvance(5);
        a.setSerialNumber(431);
        String actualString = a.toString();
        assertTrue(actualString.indexOf("(student ID required")>-1);
        //toString contains phrase (student ID required)
    }
    
}
