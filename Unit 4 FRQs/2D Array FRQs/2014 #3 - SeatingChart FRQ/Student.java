
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    /**
     * Returns the name of this Student
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the number of times this Student has missed class
     */
    public int getAbsenceCount()
    {
        return numAbsence;
    }
    
    //There may be instance variables, constructors, and methods that are not shown
    private String name;
    private int numAbsence;
    public Student(String n, int a)
    {
        name = n;
        numAbsence = a;
    }
    
    public boolean matches(Student other)
    {
        return (name.equals(other.getName()) && numAbsence==other.getAbsenceCount());
    }
    public String toString()
    {
        return name+" ("+numAbsence+")";
    }
}
