import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If the user chooses to go to the credit screen, this world will appear.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class CreditScreen extends World
{

    MenuButton menu = new MenuButton();
    
    /**
     * Constructor for buttons
     */
    public CreditScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 589, 1); 
        
        // Add objects
        addObject(menu, 99, 41);
    }
}
