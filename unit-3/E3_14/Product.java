package E3_14;


/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    // instance variables - replace the example below with your own
    private String name;
    private double price;
    
    
    

    /**
     * Constructor for objects of class Product
     */
    public Product(String name, double price)
    {
        // initialise instance variables
        this.name = name;
        this.price = price;
    }

    /**
     * Name Getter
     *
     * @param 
     * @return Name of Product
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * Price Getter
     *
     * @param 
     * @return Numerical Price of Product
     */
    public double getPrice()
    {
        // put your code here
        return price;
    }
    
    public void reducePrice(double amount){
    
        this.price -= amount;
    
    
    }
}
