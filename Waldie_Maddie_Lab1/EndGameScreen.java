import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This screen appears at the end of the game
 * 
 * @author Maddie Waldie
 * @version October 1, 2018
 */
public class EndGameScreen extends World
{

    private int scoreToDisplay;
    RestartButton restart = new RestartButton();
    MenuButton menu = new MenuButton();
    EndGameButton egButton = new EndGameButton();
    ScoreButton score = new ScoreButton();
    
    /**
     * Constructor for objects of class EndGameScreen.
     */
    public EndGameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 589, 1);
        
        // Add objects and text to screen
        addObjectsAndText();
        
    }
    
    /**
     * Method to add objects and text to screen
     */
    private void addObjectsAndText()
    {
       addObject(menu, 560, 501);
       addObject(restart, 232, 501);
       addObject(egButton, 400, 164);
       addObject(score, 400, 330); 
       
       // Get score & display it
       scoreToDisplay = getLastScore();
       showText("Score", 390, 320);
       showText("" + scoreToDisplay, 395, 340);
       
       
       
    }
    
    /**
     * Method to retreive the last score of the game
     */
    private int getLastScore()
    {
        return(Jellyfish.getScore());
    }
}
