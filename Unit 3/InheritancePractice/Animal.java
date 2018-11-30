/**
 * Animal Class
 * @author: Madeleine Waldie
 * @version: November 30, 2018
 */
public abstract class Animal
{
    //regular methods
    protected void sleep()
    {
        System.out.println("I am sleeping.... zzzzz");
    }
    
    //abstract methods - no code - only a method signature b/c will be overriden in subclass
    protected abstract void eat();
    protected abstract void play(double duration);
}
