/**
 * Animal Driver
 * @author: Madeleine Waldie
 * @version: November 26, 2018
 */
public class AnimalDriver
{
    public static void main(String[] args)
    {
        //instantiate objects
        Dog dog = new Dog(10.0); // Animal a = new Animal (); // Canot do this, because animal is abstract
        Dog snoopy = new Dog(5.0);
        Cat felix = new Cat();
        
        //polymorphism
        Animal myAnimal = new Dog(4.0);
        AnimalSwimmer doggy = new Dog(8.0);
        Pet goodBoy = new Dog(5.0);
        Pet fluffy = new Cat();
        Pet kitty = new Cat();
        myAnimal = new Cat();
        
        //call methods
        dog.eat();
        dog.play(2);
        snoopy.cuddle();
        goodBoy.cuddle();
    }
}
