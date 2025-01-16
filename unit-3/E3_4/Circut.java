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
    
    private boolean[] switches = new boolean[2];

    /**
     * Constructor for objects of class Circut
     */
    public Circut()
    {
        System.out.println("Starting Circut...");
        
    }
    
    private static int digital(boolean value){
        if (value){ return 1;} 
        else { return 0; }
    }
    public int getFirstSwitchState(){
        return digital(switches[0]);
    } // 0 for down, 1 for up
    public int getSecondSwitchState(){
        return digital(switches[1]);
    } // 0 for down, 1 for up

    public int getLampState(){
        return digital(switches[0] && switches[1]);
    
    } // 0 for off, 1 for on
    public void toggleFirstSwitch(){
        switches[0] = !switches[0];
    }
    public void toggleSecondSwitch(){
        switches[1] = !switches[1];

    }

}
