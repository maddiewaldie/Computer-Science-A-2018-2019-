/**
 * Student Advance Class
 * @author: Madeleine Waldie
 * @version: November 26, 2018 
 */
public class StudentAdvance extends Advance
{
    public StudentAdvance(int numDaysAdvance)
    {
        super(numDaysAdvance);
    }

    public double getPrice()
    {
        return(super.getPrice() / 2);
    }

    public String toString()
    {
        return(super.toString() + " (student ID required)");
    }
}
