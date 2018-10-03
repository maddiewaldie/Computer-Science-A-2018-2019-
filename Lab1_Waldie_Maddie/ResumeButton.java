import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This button, when pressed, will lead back to the CatchWorld.
 * Because the game will resume, the score and status of the game will stay as they were when the user paused the game.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class ResumeButton extends Actor
{
    /**
     * Act - do whatever the ResumeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Check to see if the user clicks the button
        mouseClick();
    }  
    
    /**
     * Method mouseClick: if the user clicks the button, the world will be set to CatchWorld.
     */
    private void mouseClick()
    {
       // Check if button is clicked
       if(Greenfoot.mouseClicked(this))
       {
           // Set world
           CatchWorld c = new CatchWorld();
           Greenfoot.setWorld(c);
           
           // Make sure the timer and score are how they were before the game was paused.
           Spongebob.setTimer(PauseButton.lastTime);
           Jellyfish.setScore(PauseButton.lastScore);
           
       }
    }
}
