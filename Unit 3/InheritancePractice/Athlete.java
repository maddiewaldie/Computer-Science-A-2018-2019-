/**
 * Athlete class
 * @author Madeleine Waldie
 * @version November 30, 2018
 */

public class Athlete
{
    // Fields
    double hoursPractice;
    boolean hasInjury;

    /**
     * Athlete constructor
     */
    public Athlete(boolean injured)
    {
        // Set initial hours of practice to 0
        hoursPractice = 0.0;

        // Set whether or not the person has an injury
        hasInjury = injured;
    }

    /**
     * workout method
     * Change hours of practice, depending on how long the workout is
     */
    protected void workout(double howLong)
    {
        hoursPractice += howLong;
    }

    /**
     * getHoursPractice method
     * Return how many hours the athlete practices
     */
    protected double getHoursPractice()
    {
        return(hoursPractice);
    }

    /**
     * getInjury method
     * Return whether the athlete is injured
     */
    protected boolean getInjury()
    {
        return(hasInjury);
    }
}