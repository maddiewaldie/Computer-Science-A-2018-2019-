/**
 * Apartment Building Class
 * @author: Madeleine Waldie
 * @version: November 26, 2018
 */
public class ApartmentBuilding extends Building
{
    private double[] aptWattHours;
    private double sumWattHours;
    private int numApartments;
    private String address;
    
    /**
     * Constructor for objects of class ApartmentBuilding
     */
    public ApartmentBuilding(String ad, int numOfApartments)
    {
        super(ad);
        numApartments = numOfApartments;
        aptWattHours = new double[numOfApartments];
    }

    public void setApartmentHours( double[] hours ) {
        for(int i=0; i<aptWattHours.length; i++) {
            aptWattHours[i] = hours[i]; }
    }
    
    public double amtOwed()
    {
        sumWattHours = 0;
        for(int i = 0; i < aptWattHours.length; i++)
        {
            sumWattHours += aptWattHours[i];
        }
        return(sumWattHours*(getRate()));
    }
    
}
