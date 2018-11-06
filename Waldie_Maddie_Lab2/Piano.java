// Imports
import greenfoot.*;

/**
 * Lab #2 - Create an Instrument - A piano that can be played with the computer keyboard.
 * @author: Madeleine Waldie
 * @version: 11/6/18
 */

public class Piano extends World
{
    // Initialize the white keys and the black keys
    private String[] wKeys = {"q","w","e","r","t","y","u","i","o","p","[","]"};  
    private String[] bKeys = {"2", "3", "", "5", "6", "7", "", "9", "0", "", "="}; // spaces indicate no key
    
    // Initialize the white notes and the black notes
    private String[] wNotes = {"3c","3d","3e","3f","3g","3a","3b","4c","4d","4e","4f","4g"};
    private String[] bNotes = {"3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#"}; // spaces indicate no sound
    
    // Initialize the coordinates of the keys
    private int whiteKeyX = 45;
    private int whiteKeyY = 170;
    private int blackKeyX = 90;
    private int blackKeyY = 115;
    
    // Initialize how far the keys should be spaced apart
    private int whiteSpacing = 65; 
    private int blackSpacing = 65;
    
    // Initialize the key images
    private String blackUpKey = "black-key.png";
    private String blackDownKey = "black-key-down.png";
    private String whitekUpKey = "white-key.png";
    private String whiteDownKey = "white-key-down.png";
    
    /**
     *  Constructor for the Piano world.
     *  Set up the dimensions of the world and add objects to the world.
     */
    public Piano() 
    {
        // Set up dimensions of world
        super(800, 340, 1);
        // Add white keys to the world
        addWhiteKeys();
        // Add black keys to the world
        addBlackKeys();
    }
    
    /**
     *  addWhiteKeys method
     *  Add all the white keys to the world, using a for loop.
     */
    private void addWhiteKeys()
    {
        // Use a loop to construct all the white keys at once
        for(int counter = 0; counter < wKeys.length; counter++) 
        {
            // Print out that the key is being made
            System.out.println("Making white key number " + counter);
            // Create new key
            Key key = new Key(wKeys[counter], wNotes[counter]+".wav", whitekUpKey, whiteDownKey);
            // Add key to world
            addObject(key, whiteKeyX + (counter*whiteSpacing), whiteKeyY);
        }

    }
    
    /**
     *  addBlackKeys method
     *  Add all the black keys to the world, using a for loop.
     */
    private void addBlackKeys()
    {
        // Use a loop to construct all the black keys at once
        for(int counter = 0; counter < wKeys.length-1; counter++) 
        {
            // Check to see if 
            if( bKeys[counter].equals("") )
            {
                // Print out that the key is NOT being made
                System.out.println("Skipping making a black key");
            }
            else 
            {
                // Print out that the key is being made
                System.out.println("Making black key number " + counter);
                // Create new key
                Key key = new Key(bKeys[counter], bNotes[counter]+".wav", blackUpKey, blackDownKey);
                // Add key to world
                addObject(key, blackKeyX + (counter*blackSpacing), blackKeyY);
            }
        }
    }
}