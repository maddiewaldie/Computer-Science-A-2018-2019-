/**
 * Animal Driver
 * @author: Madeleine Waldie
 * @version: October 26, 2018
 */
public class AnimalDriver
{
    public static void main(String[] args)
    {
        // Animal a = new Animal (); // Canot do this, because animal is abstract
        Dog d = new Dog();
        d.eat();
        d.play(2);
    }
}
