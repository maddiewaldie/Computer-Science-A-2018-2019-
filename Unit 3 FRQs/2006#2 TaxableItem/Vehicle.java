/**
 * Vehicle Class
 * @author Madeleine Waldie
 * @version December 5, 2018
 */
public class Vehicle extends TaxableItem
{
    private double cost;
    private double markup;

    /**
     * Vehicle constructor
     */
    public Vehicle(double c, double m, double rate)
    {
        super(rate);
        cost = c;
        markup = m;
    }

    /**
     * getListPrice method - returns the list price of a vehicle
     */
    public double getListPrice()
    {
        return cost + markup;
    }

    
    /**
     * changeMarkup method - changes markup of vehicle
     */
    public void changeMarkup(double m)
    {
        markup = m;
    }
}
