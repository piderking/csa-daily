package E3_3;

/**
 * Write a description of class RangeInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RangeInput
{
    // instance variables - replace the example below with your own
    public int temp;
    private int high;
    private int low;
    private int range;

    /**
     * Constructor for objects of class RangeInput
     */
    public RangeInput(int high, int low, int temp)
    {
        // initialise instance variables
        this.high = Math.max(temp, high);
        this.low = Math.min(temp, low);
        this.temp = Math.max(temp, high);
        
        
        range = this.high - this.low;
    }
    
    public void up(int units){
        temp = Math.max(temp+units, high);
    }
    public void down(int units){
        temp = Math.min(temp-units, low);
    }

}
