import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Jellyfish class outlines everything the jellyfish must do in the game.
 * The Jellyfish are the main things that Spongebob, the main character, must catch.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */

public class Jellyfish extends Actor
{
    // Variable instantiation
    private boolean startGame;
    private int randomNumber;
    private static int score;
    private int jellyType;
    private int x;
    private int y;
    private static boolean timerDone;

    /**
     * Constructor for objects of class Jellyfish.
     */
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

    /**
     * Method getTimerStatus: Returns whether or not the timer is done
     */
    public static boolean getTimerStatus()
    {
        return(timerDone);
    }
    
    /**
     * Method setTimerStatus: Sets timerDone to either true or false
     */
    public static void setTimerStatus(boolean isTrue)
    {
        if(isTrue)
        {
            timerDone = true;
        }
        else
        {
            timerDone = false;
        }
    }
    
    /**
     * Method getScore: See what the current score is
     */
    public static int getScore()
    {
        return(score);
    }
    
    /**
     * Method setScore: Increase / decrease the score
     */
    public static void setScore(int amntToAdd)
    {
        score += amntToAdd;
    }
    
    /**
     * Method resetScore: Reset the score to 0
     */
    public static void resetScore()
    {
        score = 0;
    }
    
    /**
     * Method flipLeftJellyfish: Flip the image of the left moving jellyfish. This makes them look like they're moving the right way.
     */
    private void flipLeftJellyfish()
    {
        // If the jellyfish should move towards the left, flip them so they're facing the right direction
        if(jellyType == 2 && startGame == true)
        {
            getImage().mirrorHorizontally();
            startGame = false;
        }
    }

    /**
     * Method moveJellyfishRight: Move some of the jellyfish to the right
     */
    private void moveJellyfishRight()
    {
        // If it's a right moving jellyfish, move right
        if(jellyType == 1)
        {
            move(3);
        }
    }

    /**
     * Method moveJellyfishLeft: Move some of the jellyfish to the left
     */
    private void moveJellyfishLeft()
    {
        // If it's a left moving jellyfish, move left
        if(jellyType == 2)
        {
            move(-5);
        }
    }

    /**
     * Method checkIfTouchingEdge: Check if the jellyfish is touching the edge. If it is touching the edge, move to the opposite side of the screen at a random location.
     */
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

    /**
     * Method updateScore: Update the score if a jellyfish is caught
     */
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

    /**
     * Method stopMoving: Stop moving the jellyfish
     */
    public void stopMoving()
    {
        // If the timer's done, make jellyfish stop moving
        move(0);
    }
    
    /**
     * Method addAfterGameButtons: Show the EndGameScreen if the game is over.
     */
    private void addAfterGameButtons()
    
    {
        EndGameScreen eg = new EndGameScreen();
        
        if(timerDone == true)
        {
            Greenfoot.setWorld(eg);
        }
    }
    

}
