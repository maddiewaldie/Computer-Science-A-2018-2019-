/**
 * Swimmer class
 * @author Madeleine Waldie
 * @version November 13, 2018
 */

public class Swimmer extends Athlete
{
    private String favSwimStroke;
    
    public Swimmer(boolean injured, String swimStroke)
    {
        // super constructor gives the needed parameters to the superclass
        super(injured);
        favSwimStroke = swimStroke;
    }
    
    public void printSwimStroke()
    {
        System.out.println("My favorite swim stroke is " + favSwimStroke + ".");
    }
}