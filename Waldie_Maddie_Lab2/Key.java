// Imports
import greenfoot.*;

/**
 * Lab #2 - Create an Instrument
 * @author: Madeleine Waldie
 * @version: 11/6/18
 */

public class Key extends Actor
{
    // Initialize boolean variables
    private boolean isKeyDown;
    // Initialize string variables
    private String key;
    private String note;
    private String upState;
    private String downState;
    
    /**
     *  Constructor for the Key class.
     *  Set each variable to a value.
     */
    public Key(String keyName, String noteFile, String upKeyImage, String downKeyImage)
    {
       // Set boolean variables
       isKeyDown = false; 
       // Set strings
       key = keyName;
       note = noteFile;
       upState = upKeyImage;
       downState = downKeyImage;
       // Set the keys to their "up" states.
       setImage(upState);
    }
    
    /**
     *  act method.
     *  The act method should run over and over again.
     *  When a key is pressed, it will play a sound and set the image to a "down key" image.
     */
    public void act()
    {
        playKey();
    }
    
    
    /**
     *  playKey method.
     *  Play the note that the key should make.
     */
    public void playKey()
    {
       // If the key is pressed, a note will play. Otherwise, no note will play.
       if ((isKeyDown == false) && Greenfoot.isKeyDown(key)) 
       {
            // Play the needed note
            Greenfoot.playSound(note);
            // Set the key to its down state
            setImage(downState);
            // Set boolean toggle to true
            isKeyDown = true;
        }
        else if ((isKeyDown == true) && !Greenfoot.isKeyDown(key)) 
        {
            // Set the key to its up state
            setImage(upState);
            // Set boolean toggle to false
            isKeyDown = false;
        }
    }
}