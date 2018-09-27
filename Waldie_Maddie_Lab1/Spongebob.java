import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spongebob here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class Spongebob extends Actor
{
    // Create variables
    private boolean pMoveSpongebob;
    private boolean startingMoveLeft;
    private boolean startingMoveRight;
    public static int timer;
    private int timeSecs;
    private boolean bootAdded;
    
    // Unused variables (from beginning phases of game)
    /**
    private int randomTurn = 10;
    */
   
   public Spongebob()
   {
       pMoveSpongebob = true;
       startingMoveLeft = false;
       startingMoveRight = true;
       bootAdded = true;
       timer = 1800;
       timeSecs = 30;
   }
    
    /**
     * Act - do whatever the Spongebob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Allow player to move character
        if (pMoveSpongebob)
        {
            playerMoveSpongebob();
            addBoot();
        }
        
        // Have timer run
        timer();
        
        // Unused methods (from beginning phases of game)
        /**
        moveAround();
        turnAtEdge();
        randomTurn();
        lookForCatch();
         */
    }

    private void timer()
    {
        if (timer > 0)
        {
            timer--;
            timeSecs = timer/60;
            getWorld().showText("Time: " + timeSecs, 700, 510);
            if(timer == 0)
            {
                pMoveSpongebob = false;
                Jellyfish.timerDone = true;
            }
        }
    }

    // Move Spongebob left
    private void moveLeft(int amountToMove)
    {
        setLocation(getX() + amountToMove, getY());
    }

    // Move Spongebob right
    private void moveRight(int amountToMove)
    {
        setLocation(getX() + amountToMove, getY());
    }

    // Move Spongebob up
    private void moveUp(int amountToMove)
    {
        setLocation(getX(), getY() + amountToMove);
    }

    // Move Spongebob down
    private void moveDown(int amountToMove)
    {
        setLocation(getX(), getY() + amountToMove);
    }

    // Move elephant using arrow keys on keyboard
    private void playerMoveSpongebob()
    {
        if(Greenfoot.isKeyDown("left")) 
        {
            moveLeft(-2);
            if(!startingMoveLeft)
            {
                getImage().mirrorHorizontally();
                startingMoveLeft = true;
                startingMoveRight = false;
            }
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            moveRight(2);
            if(!startingMoveRight)
            {
                getImage().mirrorHorizontally();
                startingMoveRight = true;
                startingMoveLeft = false;
            }
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            moveUp(-2);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            moveDown(2);
        }
    }
    
    private void addBoot()
    {
        // Create a new boot
        Boot boot = new Boot();
        
        // Add a boot if needed
        if((Jellyfish.score % 10 == 0) && (Jellyfish.score != 0) && !bootAdded && (Jellyfish.score > 0))
        {
            getWorld().addObject(boot, Greenfoot.getRandomNumber(780), Greenfoot.getRandomNumber(300));
            bootAdded = true;
        }
        else if ((Jellyfish.score % 10 != 0) && (Jellyfish.score != 0) && bootAdded && (Jellyfish.score > 0))
        {
            bootAdded = false;
        }
    }
    
    // Unused methods (from beginning phases of game)
    /**
    private void moveAround()
    {
        move(5);
    }
    
    private void turnAtEdge()
    {
        if(isAtEdge()) 
        {
            turn(90);
        }
    }
    
    private void randomTurn()
    {
        if(Math.Random() <= 0.2)
        {
            turn(90);
        }
    }
    
    private void lookForCatch()
    {
        if (isTouching(Jellyfish.class))
        {
            removeTouching(Jellyfish.class);
        }
    }
    */
}
