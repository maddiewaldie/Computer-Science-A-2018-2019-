/**
 * Vehicle Class
 *
 * @author Madeleine Waldie
 * @version December 5, 2018
 */
public class Vehicle extends TaxableItem
{
    private double cost;
    private double markup;

    public Vehicle(double c, double m, double rate)
    {
        super(rate);
        cost = c;
        markup = m;
    }

    public double getListPrice()
    {
        return cost + markup;
    }

    public void changeMarkup(double m)
    {
        markup = m;
    }
}
