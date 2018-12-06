/**
 * Taxable Item Class
 * @author: Madeleine Waldie
 * @version: December 6, 2018
 */
public abstract class TaxableItem implements Item
{
    private double taxRate;
    public abstract double getListPrice();

    /**
     * TaxableItem constructor
     */
    public TaxableItem(double rate)
    { 
        taxRate = rate; 
    }
    
    /**
     * purchasePrice method - returns the price of the item including the tax
     */
    public double purchasePrice()
    { 
        return(getListPrice() * (1 + taxRate));
    }
}
