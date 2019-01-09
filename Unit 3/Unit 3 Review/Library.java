import java.util.*;

/**
 * Library Class
 *
 * @author Madeleine Waldie
 * @version January 9, 2019
 */
public class Library
{
    public static void main(String[] args)
    {
        //instantiate an array list
        ArrayList<Book> myBooks = new ArrayList<Book>();
        
        // instantiate objects
        FictionBook hp3 = new FictionBook("Harry Potter & the Prisoner of Azkaban", 317);
        AudioBook ab = new AudioBook("11/22/63", 849);
        NonfictionBook ak = new NonfictionBook("American Kingpin", 352);
        ColoringBook cb = new ColoringBook("Mermaids", 50);
        
        //polymorphism (different reference & construction types)
        Book b = new ColoringBook("All About Programming", 100);
        //b.tearOutPage(); //doesn't work bc Book doesn't have this method
        
        //add books to array list
        myBooks.add(hp3);
        myBooks.add(ab);
        myBooks.add(ak);
        myBooks.add(cb);
        myBooks.add(b);
        
        // use books
        for(Book book : myBooks)
        {
            System.out.println(book.toString());
            System.out.print(book.getType() + " - ");
            book.useBook();
        }
        
        // convert to regular for loop
        for (int i = 0; i < myBooks.size(); i++)
        {
            System.out.println(myBooks.get(i).toString());
            System.out.print(myBooks.get(i).getType() + " - ");
            myBooks.get(i).useBook();
        }
    }
}
