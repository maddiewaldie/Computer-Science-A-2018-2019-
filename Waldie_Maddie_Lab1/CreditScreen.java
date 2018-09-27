import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditScreen here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class CreditScreen extends World
{

    /**
     * Constructor for objects of class CreditScreen.
     * 
     */
    MenuButton menu = new MenuButton();
    
    public CreditScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 589, 1); 
        addObject(menu, 99, 41);
    }
}
