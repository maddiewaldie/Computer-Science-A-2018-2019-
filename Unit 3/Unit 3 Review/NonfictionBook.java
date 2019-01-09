import java.util.*;

/**
 * NonfictionBook Class
 *
 * @author Madeleine Waldie
 * @version January 9, 2019
 */
public class NonfictionBook extends Book
{
    public NonfictionBook(String title, int pages)
    {
        super(title, pages);
    }
    
    public String getType()
    {
        return "Nonfiction book";
    }
}
