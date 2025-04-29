import java.util.ArrayList; // import the ArrayList class
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> items;
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice()
    {
        this.items = new ArrayList<Item>();
    }
    public void add(Item anItem){
        items.add(anItem);
    }
    public double getDiscount(){
        int pets = 0;
        int price = 0;
        int amt = 0;
        for (int i = 0; i < items.size(); i++){
            Item it = items.get(i);
            
            if (it.isPet){
                pets+=it.quantity;
                continue;
            }
            price += it.price;
            amt += it.quantity;
        }
        if (pets >= 1 && amt >= 5 ){
            return .20 * amt;
        }
        return 0.0;
    }

}
