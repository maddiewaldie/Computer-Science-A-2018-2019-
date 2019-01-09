import java.util.*;

/**
 * Book Class
 *
 * @author Madeleine Waldie
 * @version January 9, 2019
 */
public abstract class Book
{
    private String myTitle;
    private int numPages;
    private int currentPage;
    
    public Book(String title, int pages)
    {
        myTitle = title;
        numPages = pages;
        currentPage = 0;
    }
    
    public abstract String getType();
    
    public String toString()
    {
        return "Book title: "+myTitle+", number of pages: "+numPages;
    }
    
    public void useBook()
    {
        System.out.println("Read a page");
        currentPage++;
    }
}
