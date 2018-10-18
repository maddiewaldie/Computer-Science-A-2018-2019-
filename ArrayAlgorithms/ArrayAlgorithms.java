
/**
 * Write a description of class ArrayAlgorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayAlgorithms
{
    //complete the following array algorithms from class
    //and test your algorithm by running the unit tests
    //generate additional unit tests for additional confirmation
    
    /**
     * find the maximum value within the array
     * precondition: arr.length>0
     * @param int[] arr- the array to find the max of
     * @return int - the maximum value from the array
     */
    public int findMax(int[] arr)
    {
        // create max variable
        int max = arr[0];
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        
        // return the maximim value in arr
        return(max);
    }
    
    /**
     * calculate and return the sum of the values in the array
     * precondition: arr.length>0
     * @param int[] arr- the array to find the sum of
     * @return int - the sum of all values from the array
     */
    public int findSum(int[] arr)
    {
        // create sum variable
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        
        // return sum of values in arr
        return (sum);
    }
    
    /**
     * determine if all the values in the array are increasing from
     * the previous value.  Increasing means the next value is great
     * than the previous value.
     * Return true if all the values are increasing and false
     * otherwise
     * precondition: arr.length>1
     * @param int[] arr- the array to use
     * @return boolean - true if all the values are increasing,
     * false otherwise
     */
    public boolean isIncreasing(int[] arr)
    {
        // create variable for last value in the array
        int lastValue = arr[0];
        
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] > lastValue)
            {
                lastValue = arr[i];
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
     * calculate and return the avearage of the values in the array
     * precondition: arr.length>0
     * @param int[] arr- the array to find the average of
     * @return double - the average of all values from the array
     */
    public double findAverage(int[] arr)
    {
        // create sum and average variables
        double sum = 0.0;
        double average;
        
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        
        // Set average
        average = sum/((double) arr.length);
        
        // Return average of all values in arr
        return(average);
    }
    
    /**
     * determine if all the values in the array are even.
     * Return true if all the values are even and false
     * otherwise
     * precondition: arr.length>0
     * @param int[] arr- the array to use
     * @return boolean - true if all the values are even,
     * false otherwise
     */
    public boolean allEven(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 == 1)
            {
                // return false only if values in arr are odd
                return(false);
            }
        }
        
        // return true only if values in arr are even
        return true;
    }
    
    /**
     * determine if all the elements in the array's match each other
     * e.g. the two arrays are equal
     * Return true if all the values match and false
     * otherwise
     * precondition: arr.length>0
     * @param int[] arr1, int[] arr2- the two arrays to compare
     * @return boolean - true if all the values match,
     * false otherwise
     */
    public boolean allMatch(int[] arr1, int[] arr2)
    {
        if(arr1.length == arr2.length)
        {
            for(int i = 0; i < arr1.length; i++)
            {
                if(arr1[i] != arr2[i])
                {
                    // return false if values do not match
                    return(false);
                }
            }
            // return true if values do  match
            return(true);
        }
        else
        {
            // return false if array lengths are not equal
            return(false);
        }
    }
}
