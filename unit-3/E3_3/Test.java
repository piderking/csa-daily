package E3_3;
import E3_3.RangeInput;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private RangeInput var;
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        
        // initialise instance variables
        var = new RangeInput(70, 30, 50);
        System.out.println(var.temp);

        // Brother Complains that he's too hot
        var.down(10);
        
        System.out.println(var.temp);
        
        
        // Still too hot
        
        var.down(41); // should stay at 50
        System.out.println(var.temp);

        // Warm-up cause went to moutnains
        var.up(100);
        System.out.println(var.temp);

        
    }

}
