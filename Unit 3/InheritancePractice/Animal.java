/**
 * Animal Class
 * @author: Madeleine Waldie
 * @version: November 26, 2018
 */
public abstract class Animal
{
    public void sleep()
    {
        System.out.println("I am sleeping.... zzzzz");
    }
    
    /**
     * abstract method
     * no code - only a method signature b/c will be overriden in subclass
     */
    public abstract void eat();
    public abstract void play(double duration);
}
