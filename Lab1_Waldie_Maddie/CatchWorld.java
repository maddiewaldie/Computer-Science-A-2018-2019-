import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Catch World is the main world for the game, where the user will play.
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */

public class CatchWorld extends World
{
    // Characters
    Spongebob spongebob = new Spongebob();
    Plankton plankton = new Plankton();
    Karen karen = new Karen();
    
    // Objects to catch
    Jellyfish jellyfish1 = new Jellyfish(1);
    Jellyfish jellyfish2 = new Jellyfish(1);
    Jellyfish jellyfish3 = new Jellyfish(2);
    Jellyfish jellyfish4 = new Jellyfish(2);
    
    // Objects to avoid
    Can can1 = new Can();
    Can can2 = new Can();
    Boot boot1 = new Boot();
    Boot boot2 = new Boot();
    
    // Button
    PauseButton pause = new PauseButton();
    
    /**
     * Constructor for objects of class CatchWorld.
     */
    public CatchWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 589, 1); 
        
        // Create the welcome screen, and make it the first screen
        WelcomeScreen w = new WelcomeScreen();
        Greenfoot.setWorld(w);
        
        // Add objects to my world
        addObjects();
        
        // Add score & time to my world
        addScoreAndTime();
    }
    
    
    /**
     * Method to add all objects needed to the Catch World
     */
    private void addObjects()
    {
        // Objects to catch
        addObject(spongebob, 119, 401);
        addObject(jellyfish1, 86, 56);
        addObject(jellyfish2, 138, 238);
        addObject(jellyfish3, 670, 118);
        addObject(jellyfish4, 550, 315);
        
        //Pause Button
        addObject(pause, 703, 550);
    }
    
    /**
     * Method to add the score and time to the bottom right corner of the world
     */
    private void addScoreAndTime()
    {
        // Show score
        showText("Score: " + 0, 700, 480);
        
        // Show time
        showText("Time: " + 0, 700, 510);
    }
    
}
