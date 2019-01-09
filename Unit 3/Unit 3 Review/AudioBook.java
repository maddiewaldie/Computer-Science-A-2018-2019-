import java.util.*;

/**
 * AudioBook Class
 *
 * @author Madeleine Waldie
 * @version January 9, 2019
 */
public class AudioBook extends Book
{
    private int minutes;
    public AudioBook(String title, int pages)
    {
        super(title, pages);
        minutes = 0;
    }
    
    public String getType()
    {
        return("Audio Book");
    }
    
    public void useBook()
    {
        System.out.println("Listen to a minute");
        minutes++;
    }
}
