
/**
 * Write a description of class StudentRecord here.
 *
 * @author Maddie
 * @version October 22, 2018
 */
public class StudentRecord
{
    private int[] scores; //contains scores.length values
    //scores.length>1

    //constructor and other data fields not shown in question
    public StudentRecord(int[] s)
    {
        scores = s;
    }

    /**
     * returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0<= first <= last < scores.length
     */
    public double average(int first, int last)
    {
        // create variable for sum
        double sum = 0;
        
        for (int i = first; i <= last; i++)
        {
            sum += scores[i];
        }
        
        // return the average
        return sum / (last - first + 1);
    }

    /**
     * returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     */
    public boolean hasImproved()
    {
        // create variable for last value in the array
        int lastValue = scores[0];

        for (int i = 1; i < scores.length; i++)
        {
            if(scores[i] >= lastValue)
            {
                lastValue = scores[i];
            }
            else
            {
                // return false if the values are not increasing
                return(false);
            }
        }

        // return true as long as the values are increasing
        return (true);
    }

    /**
     * if the value in scores have improved, returns the average
     * of the elements in scores with indexes greater than or equal
     * to scores.length/2;
     * otherwise, returns the average of all of the values in scores
     */
    public double finalAverage()
    {
        double sum = 0.0;
        double average = 0.0;

        if(!hasImproved())
        {
            return(average(0, scores.length - 1));
        }
        else
        {
            return(average(scores.length / 2, scores.length - 1));
        }
    }
}
