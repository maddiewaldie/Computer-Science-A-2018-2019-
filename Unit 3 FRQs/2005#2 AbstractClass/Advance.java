/**
 * Advance Class
 * @author: Madeleine Waldie
 * @version: November 26, 2018 
 */
public class Advance extends Ticket
{
    private int days;
    
    public Advance(int numDaysAdvance)
    {
        super();
        days = numDaysAdvance;
    }
    
    public double getPrice()
    {
        if(days >= 10)
        {
            return(30.00);
        }
        else
        {
            return(40.00);
        }
    }
}
