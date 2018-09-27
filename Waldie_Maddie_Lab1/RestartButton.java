import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartButton here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class RestartButton extends Actor
{
    /**
     * Act - do whatever the RestartButton wants to do. This method is called whenever
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
           
           Spongebob.timer = 1800;
           Jellyfish.score = 0;
       }
    }
}
