public abstract class Building
{
    private final double RATE = 3.25;
    private String address;
    private double wattHours; //units of electricity used in 1 month
    
    public Building( String ad )
    {
        address = ad;
        wattHours = 0;
    }
    
    public double getRate()
    {
        return RATE;
    }
    
    /* returns the amount owned by this building*/
    public abstract double amtOwed( );
    
    //other methods not shown
    //Methods implemented for testing - DO NOT ALTER
    public String getAddress()
    {
        return address;
    }
    public double getWattHours()
    {
        return wattHours;
    }
}