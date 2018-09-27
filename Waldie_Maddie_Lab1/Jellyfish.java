import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jellyfish here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */

public class Jellyfish extends Actor
{
    // Variable instantiation
    private boolean startGame;
    private int randomNumber;
    public static int score;
    private int jellyType;
    private int x;
    private int y;
    public static boolean timerDone;

    public Jellyfish(int jellyType) {
        this.jellyType = jellyType;
        startGame = true;
        score = 0;
        timerDone = false;
    }

    /**
     * Act - do whatever the Jellyfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        if(timerDone == false)
        {
            // Flip the jellyfish that're moving towards the left
            flipLeftJellyfish();

            // Move the jellyfish
            moveJellyfishRight();
            moveJellyfishLeft();

            // If the jellyfish are touching the edge, move them back to the other side
            checkIfTouchingEdge();

            // Update the score
            updateScore();

            // Add other objects as needed
            //addBoot();
        }
        else if(timerDone)
        {
            // Make jellies stop moving if game is over
            stopMoving();
            
            // Add after game buttons
            addAfterGameButtons();
        }
    }    

    private void flipLeftJellyfish()
    {
        // If the jellyfish should move towards the left, flip them so they're facing the right direction
        if(jellyType == 2 && startGame == true)
        {
            getImage().mirrorHorizontally();
            startGame = false;
        }
    }

    private void moveJellyfishRight()
    {
        // If it's a right moving jellyfish, move right
        if(jellyType == 1)
        {
            move(3);
        }
    }

    private void moveJellyfishLeft()
    {
        // If it's a left moving jellyfish, move left
        if(jellyType == 2)
        {
            move(-5);
        }
    }

    private void checkIfTouchingEdge()
    {
        randomNumber = Greenfoot.getRandomNumber(300);
        
        if(isAtEdge() && jellyType == 1) {
            setLocation(-100, randomNumber);
        }
        if(isAtEdge() && jellyType == 2) {
            setLocation(800, randomNumber);
        }
    }

    private void updateScore()
    {
        Actor sb = getWorld().getObjects(Spongebob.class).get(0);
        randomNumber = Greenfoot.getRandomNumber(300);

        // Add points
        if (isTouching(Spongebob.class))
        {
            score += 1;
            if(jellyType == 1) {
                setLocation(-100, randomNumber);
            }
            else if(jellyType == 2) {
                setLocation(800, randomNumber);
            }
        }
        

        // Update display
        getWorld().showText("Score: " + score, 700, 480);

    }

    // private void addBoot()
    // {
        // Create a new boot
        // Boot boot = new Boot();
        
        // Add a boot if needed
        // if((score % 10 == 0) && (score != 0) && !bootAdded && (score > 0))
        // {
            // getWorld().addObject(boot, Greenfoot.getRandomNumber(780), Greenfoot.getRandomNumber(300));
            // bootAdded = true;
        // }
        // else if ((score % 10 != 0) && (score != 0) && bootAdded && (score > 0))
        // {
            // bootAdded = false;
        // }
    // }

    public void stopMoving()
    {
        // If the timer's done, make jellyfish stop moving
        move(0);
    }
    
    private void addAfterGameButtons()
    
    {
        EndGameScreen eg = new EndGameScreen();
        
        if(timerDone == true)
        {
            Greenfoot.setWorld(eg);
        }
    }
    

}
