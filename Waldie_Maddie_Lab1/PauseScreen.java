import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseScreen here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class PauseScreen extends World
{

    /**
     * Constructor for objects of class PauseScreen.
     * 
     */
    ResumeButton resume = new ResumeButton();
    RestartButton restart = new RestartButton();
    MenuButton menu = new MenuButton();
    
    public PauseScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 589, 1); 
        addObject(resume, 200, 491);
        addObject(menu, 400, 491);
        addObject(restart, 600, 491);
    }
}
