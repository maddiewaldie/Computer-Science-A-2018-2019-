import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The welcome screen is the first screen that the user will interact with.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class WelcomeScreen extends World
{
    StartButton start = new StartButton();
    CreditButton credits = new CreditButton();
    GameTitle title = new GameTitle();
    
    /**
     * Constructor for start button, credit button, and game title. 
     */
    public WelcomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 589, 1); 
        
        // Add objects
        addObject(title, 400, 223);
        addObject(start, 252, 491);
        addObject(credits, 531, 491);
        
    }
}
