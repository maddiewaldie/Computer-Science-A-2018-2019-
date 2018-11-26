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
    private int x;
    private Employee[] empList;
    private Employee[] tempList;

    //constructor not shown in FRQ
    //implementation for testing - do not alter
    public Company(int ra, int ry, int rs, Employee[] emps)
    {
        retireAge = ra;
        retireYears = ry;
        retireSalary = rs;
        empList = emps;
        tempList = new Employee[1];
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
     numRetireEligible = 0;
        for(int i = 0; i < empList.length; i++)
        {
            if(employeeIsEligible(empList[i]))
            {
                numRetireEligible ++;
            }
        }
    }
    /**
     * postcondition: all retirement-eligible employees have been
     * removed from empList and empList has the correct size to
     * reflect non-retirements employees.*/
    public void processRetirement( )
    {
        x = 0;
        for(int i = 0; i < empList.length; i++)
        {
            if(!employeeIsEligible(empList[i]))
            {
                tempList[x] = empList[i];
                x++;
            }
            empList = tempList;
        }
        
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