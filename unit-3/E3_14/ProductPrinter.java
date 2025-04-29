package E3_14;
import E3_14.Product;

/**
 * Write a description of class ProductPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductPrinter
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ProductPrinter
     */
    
    public static void main(String[] args){
        Product prod1 = new Product("HP ONE Printer", 100.99);
        Product prod2 = new Product("LG Smart Dock", 25.89);
        
        System.out.println(prod1.getName() + "at price " + prod1.getPrice());
        System.out.println(prod2.getName() + "at price " + prod2.getPrice());
        
        prod1.reducePrice(5.00);
        prod2.reducePrice(5.00);
        
        System.out.println(prod1.getName() + "at price " + prod1.getPrice());
        System.out.println(prod2.getName() + "at price " + prod2.getPrice());
        
    
    }
}
