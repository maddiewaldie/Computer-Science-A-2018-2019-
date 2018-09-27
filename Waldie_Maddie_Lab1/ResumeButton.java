import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ResumeButton here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class ResumeButton extends Actor
{
    /**
     * Act - do whatever the ResumeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mouseClick();
    }  
    
    private void mouseClick()
    {
       if(Greenfoot.mouseClicked(this))
       {
           CatchWorld c = new CatchWorld();
           Greenfoot.setWorld(c);
           
           Spongebob.timer = PauseButton.lastTime;
           Jellyfish.score = PauseButton.lastScore;
           
       }
    }
}
