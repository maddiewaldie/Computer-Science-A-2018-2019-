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
        
        //print index of banana
        System.out.println("Index of banana = " + myWords.indexOf("banana")); //only the location of the 1st banana
        
        //print out sixe of list
        System.out.println("Size of My Words = " + myWords.size());
        
        //remove banana
        //myWords.remove("banana"); //only removes one banana
        
        //the removal problem
        int index = 0;
        for(int i = 0; i < myWords.size(); i++)
        {
            if(myWords.get(index).equals("banana"))
            {
                myWords.remove(index);
            }
            else
            {
                index += 1;
            }
        }
        
        //other approach - jump back when you remove something
        for(int i = 0; i < myWords.size(); i++)
        {
            if(myWords.get(i).equals("banana"))
            {
                myWords.remove(i);
                i--;
            }
        }
        
        //reprint list
        System.out.println("Removed banana. Now, My Words = " + myWords);
    }
}
