import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This button, when pressed, will lead back to the CatchWorld.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class PauseButton extends Actor
{
    public static int lastTime;
    public static int lastScore;
    
    /**
     * Act - do whatever the PauseButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Check to see if the user clicks the button
        mouseClick();
    }   

    /**
     * Method: if the user clicks the button, the world will be set to PauseScreen.
     */
    private void mouseClick()
    {
       // Check if button is clicked
       if(Greenfoot.mouseClicked(this))
       {
           lastTime = getLastTime();
           lastScore = getLastScore();
           
           // Set world
           PauseScreen p = new PauseScreen();
           Greenfoot.setWorld(p);
           
           
       }
    }   
    
    /**
     * Method: Get and return the last score.
     */
    private int getLastScore()
    {
        return(Jellyfish.score);
    }
    
    /**
     * Method: Get and return the last time from the timer.
     */
    private int getLastTime()
    {
        return(Spongebob.timer);
    }
}
