import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Spongebob actor is the main character for the game.
 * The user will be able to control Spongebob, using the arrow keys on the keyboard.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
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
    private boolean canAdded;
    
    // Unused variables (from beginning phases of game)
    /**
    private int randomTurn = 10;
    */
   
   /**
     * Constructor for objects of class Spongebob.
     */
   public Spongebob()
   {
       pMoveSpongebob = true;
       startingMoveLeft = false;
       startingMoveRight = true;
       bootAdded = true;
       canAdded = true;
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
            addCan();
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
    
    /**
     * Method: Keep track of how much time (in seconds) has passed in the game.
     */
    private void timer()
    {
        // Check if timer is running
        if (timer > 0)
        {
            timer--;
            timeSecs = timer/60;
            getWorld().showText("Time: " + timeSecs, 700, 510);
            // If timer suddenly stops running, timerDone will be set to true.
            if(timer == 0)
            {
                pMoveSpongebob = false;
                Jellyfish.timerDone = true;
            }
        }
    }

    /**
     * Method: Move Spongebob left
     */
    private void moveLeft(int amountToMove)
    {
        setLocation(getX() + amountToMove, getY());
    }

    /**
     * Method: Move Spongebob right
     */
    private void moveRight(int amountToMove)
    {
        setLocation(getX() + amountToMove, getY());
    }

    /**
     * Method: Move Spongebob up
     */
    private void moveUp(int amountToMove)
    {
        setLocation(getX(), getY() + amountToMove);
    }

    /**
     * Method: Move Spongebob down
     */
    private void moveDown(int amountToMove)
    {
        setLocation(getX(), getY() + amountToMove);
    }

    /**
     * Method: Move spongebob using arrow keys on keyboard
     */
    private void playerMoveSpongebob()
    {
        // Move left with left arrow key
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
        // Move right with right arrow key
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
        // Move up with up arrow key
        else if(Greenfoot.isKeyDown("up"))
        {
            moveUp(-2);
        }
        // Move down with down arrow key
        else if(Greenfoot.isKeyDown("down"))
        {
            moveDown(2);
        }
    }
    
    /**
     * Method: Add boot to world if the score is a multiple of 5
     */
    private void addBoot()
    {
        // Create a new boot
        Boot boot = new Boot();
        
        // Add a boot if needed
        if((Jellyfish.score % 5 == 0) && (Jellyfish.score != 0) && !bootAdded && (Jellyfish.score > 0))
        {
            getWorld().addObject(boot, Greenfoot.getRandomNumber(780), Greenfoot.getRandomNumber(300));
            bootAdded = true;
        }
        else if ((Jellyfish.score % 5 != 0) && (Jellyfish.score != 0) && bootAdded && (Jellyfish.score > 0))
        {
            bootAdded = false;
        }
    }
    
    /**
     * Method: Add can to world if the score is a multiple of 10
     */
    private void addCan()
    {
        // Create a new can
        Can can = new Can();
        
        // Add a can if needed
        if((Jellyfish.score % 10 == 0) && (Jellyfish.score != 0) && !canAdded && (Jellyfish.score > 0))
        {
            getWorld().addObject(can, Greenfoot.getRandomNumber(780), Greenfoot.getRandomNumber(300));
            canAdded = true;
        }
        else if ((Jellyfish.score % 10 != 0) && (Jellyfish.score != 0) && canAdded && (Jellyfish.score > 0))
        {
            canAdded = false;
        }
    }
    
    // Unused methods (from beginning phases of game)
    
    /**
     * Method: move around the world
     */
    private void moveAround()
    {
        move(5);
    }
    
    /**
     * Method: turn Spongebob 90º if it is at the edge of the world
     */
    private void turnAtEdge()
    {
        if(isAtEdge()) 
        {
            turn(90);
        }
    }
    
    /**
     * Method: Turn Spongebob randomly, 20% of the time
     */
    private void randomTurn()
    {
        if(Math.random() <= 0.2)
        {
            turn(90);
        }
    }
    
    /**
     * Method: Check if Spongebob is touching a Jellyfish. If so, remove the jellyfish.
     */
    private void lookForCatch()
    {
        if (isTouching(Jellyfish.class))
        {
            removeTouching(Jellyfish.class);
        }
    }
    
}
