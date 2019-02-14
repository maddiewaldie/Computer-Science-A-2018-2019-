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
        String w7 = "";
        
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
        
        //indexOf
        int loc1 = w1.indexOf("lo");
        System.out.println("Location of 'lo' in Hello: " + loc1);
        int loc2 = w5.indexOf("ana", 3);
        System.out.println("Location of 'ana' in Banana: " + loc2);
        
        //length
        int len1 = w1.length();
        System.out.println("Length of word 1: " + len1);
        int len2 = w6.length();
        System.out.println("Length of word 6: " + len2);
        int len3 = w7.length();
        System.out.println("Length of word 7: " + len3);
        
        //replace
        String temp = w4.replace("p", "M");
        System.out.println("apples with p replaced with M: " + temp);
        
        //substring
        String part1 = w1.substring(2);
        System.out.println("Hello substring from location 2: " + part1);
        String part2 = w6.substring(1, 4); //4-1 = 3
        System.out.println("orange substring from location 1 to 3: " + part2);
        String temp1 = w4.substring(0, w4.length() / 2);
        String temp2 = w4.substring(w4.length() / 2);
        String mixedUp = temp2 + temp1;
        System.out.println("apples mixed up so the first half is last & the last half is first: " + mixedUp);
        
        //toLowercase & toUppercase
        String lower = w5.toLowerCase();
        System.out.println("Lower: " + lower);
        String upper = w6.toUpperCase();
        System.out.println("Upper: " + upper);
        
    }
}
