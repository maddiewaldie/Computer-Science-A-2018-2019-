/**
 * Athlete class
 * Author: Madeleine Waldie
 * Last Updated: November 13, 2018
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
    public void workout(double howLong)
    {
        hoursPractice += howLong;
    }

    /**
     * getHoursPractice method
     * Return how many hours the athlete practices
     */
    public double getHoursPractice()
    {
        return(hoursPractice);
    }

    /**
     * getInjury method
     * Return whether the athlete is injured
     */
    public boolean getInjury()
    {
        return(hasInjury);
    }
}