
/**
 * Driver class
 * @author Madeleine Waldie
 * @version November 13, 2018
 */
public class Driver
{
    public static void main(String[] args)
    {
        double mikeWorkoutHours = 0;
        double allieWorkoutHours = 0;
        
        // construct athletes with injuries
        Athlete mike = new Athlete(true);
        Athlete allie = new Athlete(false);
        
        // make mike workout
        mike.workout(2.0);
        allie.workout(3.5);
        
        // get workout hours
        mikeWorkoutHours += mike.getHoursPractice();
        allieWorkoutHours += allie.getHoursPractice();
        
        System.out.println("Mike worked out " + mikeWorkoutHours + " hours");
        System.out.println("Allie worked out " + allieWorkoutHours + " hours");
    }
}
