/**
 * Dog Class
 * @author: Madeleine Waldie
 * @version: October 26, 2018
 */
public class Dog extends Animal
{
    
    public void eat() // must code for abstract methods
    {
        System.out.println("I love to eat meat!");
    }
    
    public void play(double duration)
    {
        System.out.println("Playing with owner for " + duration + " hours.");
    }
}