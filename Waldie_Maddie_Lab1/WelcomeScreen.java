import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeScreen here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class WelcomeScreen extends World
{

    /**
     * Constructor for objects of class WelcomeScreen.
     * 
     */ 
    StartButton start = new StartButton();
    CreditButton credits = new CreditButton();
    GameTitle title = new GameTitle();
    
    public WelcomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 589, 1); 
        addObject(title, 400, 223);
        addObject(start, 252, 491);
        addObject(credits, 531, 491);
        
    }
}
