import java.util.*;

/**
 * FictionBook Class
 *
 * @author Madeleine Waldie
 * @version January 9, 2019
 */
public class FictionBook extends Book
{
    public FictionBook(String title, int pages)
    {
        super(title, pages);
    }
    
    public String getType()
    {
        return("Fiction Book");
    }
}
