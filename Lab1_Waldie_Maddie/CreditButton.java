import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This button, when pressed, will lead back to the Credit Screen.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class CreditButton extends Actor
{
    /**
     * Act - do whatever the CreditButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Check to see if the user clicks the button
        mouseClick();
    } 
    
    /**
     * Method: if the user clicks the button, the world will be set to CreditScreen.
     */
    private void mouseClick()
    {
       // Check if button is clicked
       if(Greenfoot.mouseClicked(this))
       {
           // Set world
           CreditScreen c = new CreditScreen();
           Greenfoot.setWorld(c);
       }
    }

}

