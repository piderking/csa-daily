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

    /**
     * Constructor for objects of class RangeInput
     */
    public RangeInput(int high, int low)
    {
        // initialise instance variables
        this.high = Math.max(temp, high);
        this.low = Math.min(temp, low);
        this.temp = (low + high) / 2;
        
        
        //range = this.high - this.low;
    }
    
    public void up(){
        temp = Math.max(temp+1, high);
    }
    
   
    public void down(){
        temp = Math.max(temp-1, low);
    }
    
    public int getCurrent(){
        return temp;
    }

}
