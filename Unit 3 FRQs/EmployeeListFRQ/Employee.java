public class Employee
{
    //fields
    private int age;
    private int yearsOnJob;
    private double salary;
    private int id;
    
    //constructors not shown in FRQ
    //implementation for testing - do not alter
    public Employee(int a, int years, double sal, int idNum)
    {
        age = a;
        yearsOnJob = years;
        salary = sal;
        id = idNum;
    }
    
    //methods
    public int getAge()
    {
        return age;
    }
    public int getYearsOnJob()
    {
        return yearsOnJob;
    }
    public double getSalary()
    {
        return salary;
    }
    public int getID()
    {
        return id;
    }
}