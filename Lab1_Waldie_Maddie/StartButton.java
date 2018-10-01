import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When the start button is pressed, the game will start.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class StartButton extends Actor
{
    private int button;
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
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
           
           // Reset timer and score
           Spongebob.timer = 1800;
           Jellyfish.score = 0;
       }
    }

}
