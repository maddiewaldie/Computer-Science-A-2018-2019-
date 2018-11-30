/**
 * Cat Class
 *
 * @author: Madeleine Waldie
 * @version: November 30, 2018
 */
public class Cat extends Animal implements Pet, Friendly
{
    //methods
    public void eat()
    {
        System.out.println("I am eating cat food");
    }
    
    public void play(double duration)
    {
        System.out.println("Playing with owner for" + duration + " hours.");
    }
    
    public void cuddle()
    {
        System.out.println("Cuddling with owner on couch");
    }
    
    public void playWithOwner()
    {
        play(10);
    }
    
    public void beNice()
    {
        System.out.println("purr purr");
    }
}