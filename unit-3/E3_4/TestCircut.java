package E3_4;
import E3_4.Circut;

/**
 * Write a description of class TestCircut here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCircut
{
    // instance variables - replace the example below with your own
    private Circut circut;

    /**
     * Constructor for objects of class TestCircut
     */
    public TestCircut()
    {
        // initialise instance variables
        circut = new Circut();
        
        System.out.println(circut.getFirstSwitchState());
        
        System.out.println(circut.getSecondSwitchState());
        
        System.out.println(circut.getLampState());
        
        circut.toggleFirstSwitch();
        
        System.out.println(circut.getFirstSwitchState());
        System.out.println(circut.getLampState());

        circut.toggleSecondSwitch();
        
        System.out.println(circut.getSecondSwitchState());
        System.out.println(circut.getLampState());

    }

    
}
