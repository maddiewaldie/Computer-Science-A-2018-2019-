import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.List;
/**
 * A Greep is an alien creature that likes to collect tomatoes.
 * 
 * @author Madeleine Waldie
 * @version 1.0
 */
public class Greep extends Creature
{
    // Remember: you cannot extend the Greep's memory. So:
    // no additional fields (other than final fields) allowed in this class!

    /**
     * Default constructor for testing purposes.
     */
    public Greep()
    {
        this(null);
    }

    /**
     * Create a Greep with its home space ship.
     */
    public Greep(Ship ship)
    {
        super(ship);
    }

    /**
     * Do what a greep's gotta do.
     */
    public void act()
    {
        super.act();   // Do not delete! Leave as first statement in act().
        // Check if greep is carrying a tomato
        if (carryingTomato()) {
            if (atShip()) {
                dropTomato(); // Deliver tomato if greep is at the ship
            }
            else {
                moveGreepTomato(); // If the greep has a tomato, switch to  the move method for tomato-carriers
            }
        }
        else {
            checkFood(); //Check if there is a tomato, and if so, load a tomato onto the greep's back
            moveGreepNoTomato(); // If the greep does not have  a tomato, make it move using the method for non-tomato-carriers
        }
    }

    /**
     * Is there any food here where we are? If so, try to load some!
     */
    public void checkFood()
    {
        // Check whether there's a tomato pile here
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject(TomatoPile.class);
        if (tomatoes != null) {
            loadTomato(); // Put tomato on other greep's back
            spit("purple"); // Leave a purple dot where there are tomatoes
        }
    }

    /**
     * This method specifies the name of the author (for display on the result board).
     */
    public static String getAuthorName()
    {
        return "Madeleine Waldie";
    }

    /**
     * This method specifies the image we want displayed at any time. (No need 
     * to change this for the competition.)
     */
    public String getCurrentImage()
    {
        if (carryingTomato())
            return "greep-with-food.png";
        else
            return "greep.png";
    }

    /**
     * This method moves any greep that has a tomato.
     */
    public void moveGreepTomato()
    {
        move(); // Move greep
        edgeDetector(); // Detect whether greep is at edge of screen or water
        checkFood(); // Is there any food here where we are? If so, try to load some!

        // If can turn toward ship & has a tomato
        if(!seePaint("orange") && !(atWater() || atWorldEdge()) && carryingTomato())
        {
            turnHome(); // Turn toward ship
        }

    }

    /**
     * This method moves any greep that does not have a tomato.
     */
    public void moveGreepNoTomato()
    {
        // If greep doesn't have a tomato & it sees purple
        if(!seePaint("purple") && !carryingTomato())
        {
            move(); // Move greep
        }
        edgeDetector(); // Detect whether greep is at edge of screen or water
    }

    /**
     * This method detects whether a greep is at the edge of the screen or
     * at the edge of the water. If so, the greeps will spit orange.
     */
    public void edgeDetector()
    {
        // If greep is somewhere where it will get stuck
        if(atWater() || atWorldEdge())
        {
            spit("orange"); // Leave an orange trail
            turn(20); // Turn 20º
        }
    }

}