import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Can here.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class Can extends Actor
{
    /**
     * Act - do whatever the Can wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // As long as the game is still running, these things will be called
        if (Jellyfish.timerDone == false)
        {
            // Move the boot
            moveCan(5);
            
            // Turn randomly
            randomTurn(90);
            
            // Decrement the score if Spongebob touches the boot.
            takeAwayPoints();
            
            // If the boot touches the edge, it will turn
            edgeTouch();
        }
    }   
    
    /**
     * Method: move the boot around the world
     */
    private void moveCan(int amntToMove)
    {
        move(amntToMove);
    }
    
    /**
     * Method: randomly turn the boot
     */
    private void randomTurn(int amntToTurn)
    {
        if((Math.random()*20) <= 0.40)
        {
            turn(Greenfoot.getRandomNumber(amntToTurn));
        }
    }
    
    /**
     * Method: take away points if the boot touches the spongebob class
     */
    private void takeAwayPoints()
    {
        if (isTouching(Spongebob.class))
        {
            // Decrement the score
            Jellyfish.score -= 10;
            
            // Remove can
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Method: if the boot touches the edge, it will turn away
     */
    private void edgeTouch()
    {
        if(getWorld() == null) 
        {
            return;
        }
        // Check if can is at edge
        else if(isAtEdge())
        {
            // Turn can
            turn(90);
        }
    }
}
