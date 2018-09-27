import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseButton here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class PauseButton extends Actor
{
    /**
     * Act - do whatever the PauseButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int lastTime;
    public static int lastScore;
    
    public void act() 
    {
        mouseClick();
    }   

    private void mouseClick()
    {
       if(Greenfoot.mouseClicked(this))
       {
           lastTime = getLastTime();
           lastScore = getLastScore();
           PauseScreen p = new PauseScreen();
           Greenfoot.setWorld(p);
           
           
       }
    }   
    
    private int getLastScore()
    {
        return(Jellyfish.score);
    }
    
    private int getLastTime()
    {
        return(Spongebob.timer);
    }
}
