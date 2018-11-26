public abstract class Ticket
{
    private int serialNumber;
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }
    
    public abstract double getPrice();
    
    public String toString()
    {
        return "Number: "+serialNumber+" \nPrice: " + getPrice();
    }
    
    private static int getNextSerialNumber()
    {
        //implementation not shown in code;
        return 0;
    }
    
    //method implemented for testing - Do not alter
    public void setSerialNumber(int num)
    {
        serialNumber=num;
    }
}