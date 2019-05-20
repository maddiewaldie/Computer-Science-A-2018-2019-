import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.List;
/**
 * A Greep is an alien creature that likes to collect tomatoes.
 * 
 * @author Madeleine Waldie
 * @version 0.1
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
        super.act();   // do not delete! leave as first statement in act().
        // Check if greep is carrying a tomato
        if (carryingTomato()) {
            if (atShip()) {
                dropTomato();
            }
            else {
                moveGreepTomato();
            }
        }
        else {
            checkFood(); //Check if there is a tomato, and if so, load a tomato onto the greep's back
            moveGreepNoTomato();
        }
    }

    /**
     * Is there any food here where we are? If so, try to load some!
     */
    public void checkFood()
    {
        // check whether there's a tomato pile here
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject(TomatoPile.class);
        if (tomatoes != null) {
            loadTomato();
            spit("purple");
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
        move();
        edgeDetector();
        checkFood();
        if(!seePaint("orange") && !(atWater() || atWorldEdge()) && carryingTomato())
        {
            turnHome();
        }

    }
    
    /**
     * This method moves any greep that does not have a tomato.
     */
    public void moveGreepNoTomato()
    {
        if(!seePaint("purple") && !carryingTomato())
        {
            move();
        }
        edgeDetector();
    }

    /**
     * This method detects whether a greep is at the edge of the screen or
     * at the edge of the water. If so, the greeps will spit orange.
     */
    public void edgeDetector()
    {
        if(atWater() || atWorldEdge())
        {
            spit("orange");
            turn(20);
        }
    }

}