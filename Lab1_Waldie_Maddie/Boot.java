import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The boot is an object that Spongebob will have to avoid.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class Boot extends Actor
{
    
    /**
     * Act - do whatever the Boot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // As long as the game is still running, these things will be called
        if (Jellyfish.getTimerStatus() == false)
        {
            // Move the boot
            moveBoot(5);
            
            // Turn randomly
            randomTurn(90);
            
            // Decrement the score if Spongebob touches the boot.
            takeAwayPoints();
            
            // If the boot touches the edge, it will turn
            edgeTouch();
        }
    }   
    
    /**
     * Method moveBoot: move the boot around the world
     */
    private void moveBoot(int amntToMove)
    {
        move(amntToMove);
    }
    
    /**
     * Method randomTurn: randomly turn the boot
     */
    private void randomTurn(int amntToTurn)
    {
        if((Math.random()*20) <= 0.40)
        {
            turn(Greenfoot.getRandomNumber(amntToTurn));
        }
    }
    
    /**
     * Method takeAwayPoints: take away points if the boot touches the spongebob class
     */
    private void takeAwayPoints()
    {
        if (isTouching(Spongebob.class))
        {
            // Decrement the score
            Jellyfish.setScore(-2);
            
            // Remove boot
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Method edgeTouch: if the boot touches the edge, it will turn away
     */
    private void edgeTouch()
    {
        if(getWorld() == null) 
        {
            return;
        }
        // Check if boot is at edge
        else if(isAtEdge())
        {
            // Turn boot
            turn(90);
        }
    }
    
}
