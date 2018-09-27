import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boot here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class Boot extends Actor
{
    
    /**
     * Act - do whatever the Boot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Jellyfish.timerDone == false)
        {
            moveBoot(5);
            randomTurn(90);
            takeAwayPoints();
            edgeTouch();
        }
    }   
    
    private void moveBoot(int amntToMove)
    {
        move(amntToMove);
    }
    
    private void randomTurn(int amntToTurn)
    {
        if((Math.random()*20) <= 0.40)
        {
            turn(Greenfoot.getRandomNumber(amntToTurn));
        }
    }
    
    private void takeAwayPoints()
    {
        if (isTouching(Spongebob.class))
        {
            Jellyfish.score -= 1;
            getWorld().removeObject(this);
        }
    }
    
    private void edgeTouch()
    {
        if(getWorld() == null) 
        {
            return;
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
    
}
