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
        String w5 = "banana";
        String w6 = "orange";
        
        //charAt(int loc) --> character
        char letter1 = w1.charAt(0);
        System.out.println(letter1);
        char letter2 = w1.charAt(1);
        System.out.println(letter2);
        char letter3 = w1.charAt(w1.length() - 1);
        System.out.println(letter3);
        
        //compareTo
        int comp1 = w1.compareTo(w3);
        System.out.println("Word 1 compared to Word 3: " + comp1); //returns 0 --> same alphabetically
        int comp2 = w1.compareTo(w2);
        System.out.println("Word 1 compared to Word 2: " + comp2); //returns -32 --> w1 comes before w2
        int comp3 = w2.compareTo(w1);
        System.out.println("Word 2 compared to Word 1: " + comp3); //returns 32 --> w2 comes after w1
        int comp4 = w4.compareTo(w5);
        System.out.println("Word 4 compared to Word 5: " + comp4); //returns -2 --> w4 comes before w5
        int comp5 = w6.compareTo(w4);
        System.out.println("Word 6 compared to Word 4: " + comp5); //returns 14 --> w6 comes after w4
        
        //equals
        boolean eq1 = w1.equals(w3);
        System.out.println("Word 1 compared to Word 3: " + eq1); //returns true
        boolean eq2 = w1.equals(w2);
        System.out.println("Word 1 compared to Word 2: " + eq2); //returns false
        boolean eq3 =  w4.equals(w5);
        System.out.println("Word 4 compared to Word 5: " + eq3); //returns false
    }
}
