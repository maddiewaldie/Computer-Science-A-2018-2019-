//imports
import java.util.*;

/**
 * ListDriver Class
 *
 * @author Madeleine Waldie
 * @version December 12, 2018
 */
public class ListDriver
{
    public static void main(String args[])
    {
        //instantiate array list
        ArrayList<String> myWords = new ArrayList<String>();
        //add objects to list
        myWords.add("banana");
        myWords.add("banana");
        myWords.add("goat");
        myWords.add(0, "banana");
        myWords.add("banana");
        myWords.add(3, "fish");
        //set values in list
        myWords.set(5, "apple");
        //print array list
        System.out.println("My Words = " + myWords);
        //print out 3rd item in list
        System.out.println("3rd item in index = " + myWords.get(3));
    }
}
