import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Karen is an actor that Spongebob, the main character, should avoid.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class Karen extends Actor
{
    private int amountToMove;
    private boolean touchingEdge;
    private boolean startKaren;
    private boolean karenFlipped;
    
    public Karen()
    {
        amountToMove = -5;
        touchingEdge = true;
        startKaren = true;
        karenFlipped = false;
        
    }
    
    /**
     * Act - do whatever the Boot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // As long as the game is still running, these things will be called
        if (!karenFlipped && !startKaren)
        {
            getImage().mirrorHorizontally();
            karenFlipped = true;
            startKaren = false;
        }
        
        if (Jellyfish.getTimerStatus() == false)
        {
            // Move the boot
            moveKaren(amountToMove);
            
            // Decrement the score if Spongebob touches the boot.
            takeAwayPoints();
            
            // If the boot touches the edge, it will turn
            edgeTouch();
        }
    }   
    
    /**
     * Method moveKaren: This moves Karen around the world
     */
    private void moveKaren(int amntToMove)
    {
        move(amntToMove);
    }
    
    /**
     * Method takeAwayPoints: This takes away points if Karen touches the spongebob class
     */
    private void takeAwayPoints()
    {
        if (isTouching(Spongebob.class))
        {
            // Decrement the score
            Jellyfish.setScore(-15);
            
            // Remove boot
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Method edgeTouch: If karen touches the edge, it bounce back and go the other direction
     */
    private void edgeTouch()
    {
        if(getWorld() == null) 
        {
            return;
        }
        // Check if boot is at edge
        else if(isAtEdge() && !touchingEdge)
        {  
            touchingEdge = true;
            getImage().mirrorHorizontally();
            if (amountToMove == 5)
            {
                amountToMove = -5;
            }
            else if (amountToMove == -5)
            {
                amountToMove = 5;
            }
        }
        
        if(!isAtEdge())
        {
            touchingEdge = false;
        }
    } 
}
