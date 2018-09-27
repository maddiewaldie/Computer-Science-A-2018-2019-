import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuButton here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class MenuButton extends Actor
{
    /**
     * Act - do whatever the MenuButton wants to do. This method is called whenever
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
           WelcomeScreen w = new WelcomeScreen();
           Greenfoot.setWorld(w);
       }
    }
}
