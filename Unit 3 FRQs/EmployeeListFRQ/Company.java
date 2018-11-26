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
        //to be implemented in part a
        /*
        Write the employeeIsEligible method if he/she meets at least two of the following requirements:
        - The employee is at least retireAge years old
        - The employee has worked for at least retireYears
        - The employee’s salary is at least retireSalary
        The employeeIsEligible returns true if they are eligible to retire or 
        false if they are not eligible.
        */
       
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