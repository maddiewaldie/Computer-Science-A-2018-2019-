/**
 * Dog Class
 * @author: Madeleine Waldie
 * @version: November 30, 2018
 */
public class Dog extends Animal implements Pet, Friendly, AnimalSwimmer
{
    //instantiate variables
    private double dist;
    
    //constructor
    public Dog(double distance)
    {
        dist = distance;
    }
    
    //methods
    public void eat() // must code for abstract methods
    {
        System.out.println("I love to eat meat!");
    }
    
    public void play(double duration)
    {
        System.out.println("Playing for " + duration + " hours.");
    }
    
    public void cuddle()
    {
        System.out.println();
    }
    
    public void playWithOwner()
    {
        play(5);
    }
    
    public void beNice()
    {
      System.out.println("Woof woof");
    }
    
    public void swim(double distance)
    {
        System.out.println("Swimming for " + dist + " miles");
    }
    
    public double getSwimDistance()
    {
        return(dist);
    }
}