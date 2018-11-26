/**
 * Company Class
 * @author: Madeleine Waldie
 * @version: November 26, 2018
 */
public class Company
{
    private int retireAge;
    private int retireYears;
    private double retireSalary;
    private int numRetireEligible;
    private Employee[] empList;

    //constructor not shown in FRQ
    //implementation for testing - do not alter
    public Company(int ra, int ry, int rs, Employee[] emps)
    {
        retireAge = ra;
        retireYears = ry;
        retireSalary = rs;
        empList = emps;
    }

    //methods
    /**
     * postcondition: returns true if an employee e is eligible to
     * retire; otherwise returns false.*/
    public boolean employeeIsEligible( Employee e )
    {
       boolean condition1;
       boolean condition2;
       boolean condition3;
       condition1 = ((e.getAge() >= retireAge) && (e.getYearsOnJob() >= retireYears));
       condition2 = ((e.getAge() >= retireAge) && (e.getSalary() >= retireSalary));
       condition3 = ((e.getYearsOnJob() >= retireYears) && (e.getSalary() >= retireSalary));
       
       if(condition1 || condition2 || condition3)
       {
           return(true);
       }
       else
       {
           return(false);
       }
    }

    /**
     * postcondition: updates the numRetireEligible field to
     * the total number of employees that are eligible for
     * retirement.*/
    public void updateNumRetireEligible( )
    {
        //to be implemented in part b
        /*
        Write the method updateNumRetireEligible.  This method should also update the 
        field numRetireEligible to reflect the total number of employees that are eligible 
        for retirement.  It should not return anything, but rather just update the field 
        based on the conditions of retirement eligibility and the array of employees.  
        You may use your method written in part A, assuming it works as described by the 
        postcondition.*/
        
    }
    /**
     * postcondition: all retirement-eligible employees have been
     * removed from empList and empList has the correct size to
     * reflect non-retirements employees.*/
    public void processRetirement( )
    {
        //to be implemented in part c
        /*
         Write the method processRetirement.  If an employee is eligible for retirement 
         they should be removed from the array of employees.  You may need to make a 
         temporary array to add those employees who cannot retire, determine the size of 
         this array, and use this newly created array to set the old empList.  This method 
         should not return anything, but rather update the empList array.
         */
        
    }

    
    //methods for testing - DO NOT ALTER
    public int getNumRetireEligible()
    {
        return numRetireEligible;
    }
    public Employee[] getEmpList()
    {
        return empList;
    }
}