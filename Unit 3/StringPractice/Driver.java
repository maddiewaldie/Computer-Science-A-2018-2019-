/**
 * Write a description of class Driver here.
 *
 * @author Madeleine Waldie
 * @version February 1, 2019
 */
public class Driver
{
    public static void main(String[] args)
    {
        String w1 = "Hello";
        String w2 = "hello"; 
        String w3 = "Hello"; 
        String w4 = "apples";
        String w5 = "Banana";
        String w6 = "orange";
        
        //charAt(int loc) --> character
        char letter1 = w1.charAt(0);
        System.out.println(letter1);
        char letter2 = w1.charAt(1);
        System.out.println(letter2);
        char letter3 = w1.charAt(w1.length() - 1);
        System.out.println(letter3);
    }
}
