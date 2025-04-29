package E3_4;


/**
 * Write a description of class Circut here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circut
{
    // instance variables - replace the example below with your own
    
    private int[] switches = new int[3];
    
    /**
     * Constructor for objects of class Circut
     */
    public Circut()
    {
        System.out.println("Starting Circut...");
        
    }
    
    
    public int getFirstSwitchState(){
        return switches[0] % 2;
    } // 0 for down, 1 for up
    public int getSecondSwitchState(){
        return switches[1] % 2;
    } // 0 for down, 1 for up

    public int getLampState(){
        return switches[2] % 2;
    
    } // 0 for off, 1 for on
    public void toggleFirstSwitch(){
        switches[0] += 1;
        switches[2] += 1;

    }
    public void toggleSecondSwitch(){
        switches[1] += 1;
        switches[2] += 1;
        
    }

}
