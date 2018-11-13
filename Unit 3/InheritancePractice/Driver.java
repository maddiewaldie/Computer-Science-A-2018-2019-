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
        double fifiWorkoutHours = 0;
        double allieWorkoutHours = 0;
        
        // construct athletes with injuries
        Athlete mike = new Athlete(true);
        Athlete allie = new Athlete(false);
        
        // construct swimmers
        Swimmer fifi = new Swimmer(false, "backstroke");
        
        // make athletes workout
        mike.workout(2.0);
        fifi.workout(3);
        allie.workout(3.5);
        
        // get workout hours
        mikeWorkoutHours += mike.getHoursPractice();
        fifiWorkoutHours += fifi.getHoursPractice();
        allieWorkoutHours += allie.getHoursPractice();
        
        // print info needed
        System.out.println("Mike worked out " + mikeWorkoutHours + " hours.");
        System.out.println("Fifi worked out " + fifiWorkoutHours + " hours.");
        System.out.println("Allie worked out " + allieWorkoutHours + " hours.");
        
        // see what the favorite strokes are for swimmers
        fifi.printSwimStroke();
    }
}
