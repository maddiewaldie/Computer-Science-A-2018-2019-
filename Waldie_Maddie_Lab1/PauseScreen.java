import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The pause screen comes up when the user pauses the game from the catch world.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class PauseScreen extends World
{
    ResumeButton resume = new ResumeButton();
    RestartButton restart = new RestartButton();
    MenuButton menu = new MenuButton();
    GameTitle title = new GameTitle();
   
    /**
     * Constructor for objects of class PauseScreen.
     */
    public PauseScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 589, 1); 
        
        // Add objects
        addObject(title, 400, 223);
        addObject(resume, 200, 491);
        addObject(menu, 400, 491);
        addObject(restart, 600, 491);
    }
}
