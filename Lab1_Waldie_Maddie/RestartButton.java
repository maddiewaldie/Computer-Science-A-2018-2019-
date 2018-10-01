import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This button, when pressed, will lead back to the CatchWorld.
 * The score and timer will be reset, and the game will start over.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class RestartButton extends Actor
{
    /**
     * Act - do whatever the RestartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Check to see if the user clicks the button
        mouseClick();
    }    
    
    /**
     * Method: if the user clicks the button, the world will be set to CatchWorld.
     */
    private void mouseClick()
    {
       // Check if button is clicked
       if(Greenfoot.mouseClicked(this))
       {
           // Set world
           CatchWorld c = new CatchWorld();
           Greenfoot.setWorld(c);
           
           // Reset the timer and score
           Spongebob.timer = 1800;
           Jellyfish.score = 0;
       }
    }
}
