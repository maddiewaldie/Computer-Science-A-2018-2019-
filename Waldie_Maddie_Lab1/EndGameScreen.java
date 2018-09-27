import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGameScreen here.
 * 
 * @author Maddie Waldie
 * @version September 27, 2018
 */
public class EndGameScreen extends World
{

    /**
     * Constructor for objects of class EndGameScreen.
     * 
     */
    private int scoreToDisplay;
    RestartButton restart = new RestartButton();
    MenuButton menu = new MenuButton();
    EndGameButton egButton = new EndGameButton();
    ScoreButton score = new ScoreButton();
    
    public EndGameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(792, 589, 1);
        addObjectsAndText();
        
    }
    
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
    
    private int getLastScore()
    {
        return(Jellyfish.score);
    }
}
