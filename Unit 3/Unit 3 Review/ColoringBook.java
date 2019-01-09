import java.util.*;

/**
 * ColoringBook Class
 *
 * @author Madeleine Waldie
 * @version January 9, 2019
 */
public class ColoringBook extends Book
{
    private int pagesColored;
    
    public ColoringBook(String title, int pages)
    {
        super(title, pages);
        pagesColored = 0;
    }
    
    public String getType()
    {
        return("Coloring Book");
    }
    
    public void useBook()
    {
        System.out.println("Color a page");
        pagesColored++;
    }
    
    public void tearOutPage()
    {
        System.out.println("Tearing out page & hanging up my picture");
    }
}
