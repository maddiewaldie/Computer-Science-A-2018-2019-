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
    public void testA1()
    {
        Employee e1 = new Employee(30, 15, 30000,1);
        Employee e2 = new Employee(47, 26, 72000,2);
        Employee e3 = new Employee(60, 20, 65000,3);
        Employee e4 = new Employee(62, 31, 250000,4);
        Employee e5 = new Employee(70, 45, 16000,5);
        Employee[] emps = {e1, e2, e3, e4, e5};
        //int ra, int ry, int rs, Employee[] emps
        Company c = new Company(60, 25, 70000, emps);
        assertTrue(c.employeeIsEligible(e1)==false);
    }
    public void testA2()
    {
        Employee e1 = new Employee(30, 15, 30000,1);
        Employee e2 = new Employee(47, 26, 72000,2);
        Employee e3 = new Employee(60, 20, 65000,3);
        Employee e4 = new Employee(62, 31, 250000,4);
        Employee e5 = new Employee(70, 45, 16000,5);
        Employee[] emps = {e1, e2, e3, e4, e5};
        //int ra, int ry, int rs, Employee[] emps
        Company c = new Company(60, 25, 70000, emps);
        assertTrue(c.employeeIsEligible(e2)==true);
    }
    public void testA3()
    {
        Employee e1 = new Employee(30, 15, 30000,1);
        Employee e2 = new Employee(47, 26, 72000,2);
        Employee e3 = new Employee(60, 20, 65000,3);
        Employee e4 = new Employee(62, 31, 250000,4);
        Employee e5 = new Employee(70, 45, 16000,5);
        Employee[] emps = {e1, e2, e3, e4, e5};
        //int ra, int ry, int rs, Employee[] emps
        Company c = new Company(60, 25, 70000, emps);
        assertTrue(c.employeeIsEligible(e3)==false);
    }
    public void testA4()
    {
        Employee e1 = new Employee(30, 15, 30000,1);
        Employee e2 = new Employee(47, 26, 72000,2);
        Employee e3 = new Employee(60, 20, 65000,3);
        Employee e4 = new Employee(62, 31, 250000,4);
        Employee e5 = new Employee(70, 45, 16000,5);
        Employee[] emps = {e1, e2, e3, e4, e5};
        //int ra, int ry, int rs, Employee[] emps
        Company c = new Company(60, 25, 70000, emps);
        assertTrue(c.employeeIsEligible(e4)==true);
    }
    public void testA5()
    {
        Employee e1 = new Employee(30, 15, 30000,1);
        Employee e2 = new Employee(47, 26, 72000,2);
        Employee e3 = new Employee(60, 20, 65000,3);
        Employee e4 = new Employee(62, 31, 250000,4);
        Employee e5 = new Employee(70, 45, 16000,5);
        Employee[] emps = {e1, e2, e3, e4, e5};
        //int ra, int ry, int rs, Employee[] emps
        Company c = new Company(60, 25, 70000, emps);
        assertTrue(c.employeeIsEligible(e5)==true);
    }
    public void testB1()
    {
        Employee e1 = new Employee(30, 15, 30000,1);
        Employee e2 = new Employee(47, 26, 72000,2);
        Employee e3 = new Employee(60, 20, 65000,3);
        Employee e4 = new Employee(62, 31, 250000,4);
        Employee e5 = new Employee(70, 45, 160000,5);
        Employee[] emps = {e1, e2, e3, e4, e5};
        //int ra, int ry, int rs, Employee[] emps
        Company c = new Company(60, 25, 70000, emps);
        c.updateNumRetireEligible();
        int num = c.getNumRetireEligible();
        assertTrue(num==3);
    }
    public void testC1()
    {
        Employee e1 = new Employee(30, 15, 30000,1);
        Employee e2 = new Employee(47, 26, 72000,2);
        Employee e3 = new Employee(60, 20, 65000,3);
        Employee e4 = new Employee(62, 31, 250000,4);
        Employee e5 = new Employee(70, 45, 160000,5);
        Employee[] emps = {e1, e2, e3, e4, e5};
        //int ra, int ry, int rs, Employee[] emps
        Company c = new Company(60, 25, 70000, emps);
        c.updateNumRetireEligible();
        c.processRetirement();
        Employee[] newList = c.getEmpList();
        boolean okLength = (newList.length==2);
        boolean checke1 = (newList[0].getID()==1 || newList[1].getID()==1);
        boolean checke2 = (newList[0].getID()==3 || newList[1].getID()==3);
        assertTrue(okLength==true && checke1==true && checke2==true);
    }
    
    //methods for testing - do not alter
    
}
