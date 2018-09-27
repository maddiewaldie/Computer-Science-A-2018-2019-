import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditButton here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class CreditButton extends Actor
{
    /**
     * Act - do whatever the CreditButton wants to do. This method is called whenever
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
           CreditScreen c = new CreditScreen();
           Greenfoot.setWorld(c);
       }
    }

}

