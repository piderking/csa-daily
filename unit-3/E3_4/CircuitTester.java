package E3_4;
import E3_4.Circut;
// SAMPLE
public class CircuitTester {

    public static void main(String[] args) {
        
        Circut wiring = new Circut();
        
        System.out.println(" Toggling First switch ") ; 
        wiring.toggleFirstSwitch();
        System.out.println("Switch 1: " + wiring.getFirstSwitchState());
        System.out.println("Expected: 1");
        System.out.println("Switch 2: " + wiring.getSecondSwitchState());
        System.out.println("Expected: 0");
        System.out.println("Lamp: " + wiring.getLampState());
        System.out.println("Expected: 1");
        
        System.out.println(" Toggling Second switch ") ; 
        wiring.toggleSecondSwitch();
        System.out.println("Switch 1: " + wiring.getFirstSwitchState());
        System.out.println("Expected: 1");
        System.out.println("Switch 2: " + wiring.getSecondSwitchState());
        System.out.println("Expected: 1");
        System.out.println("Lamp: " + wiring.getLampState());
        System.out.println("Expected: 0");
        
        System.out.println(" Toggling First switch ") ; 
        wiring.toggleFirstSwitch();
        System.out.println("Switch 1: " + wiring.getFirstSwitchState());
        System.out.println("Expected: 0");
        System.out.println("Switch 2: " + wiring.getSecondSwitchState());
        System.out.println("Expected: 1");
        System.out.println("Lamp: " + wiring.getLampState());
        System.out.println("Expected: 1");
        
        System.out.println(" Toggling Second switch ") ; 
        wiring.toggleSecondSwitch();
        System.out.println("Switch 1: " + wiring.getFirstSwitchState());
        System.out.println("Expected: 0");
        System.out.println("Switch 2: " + wiring.getSecondSwitchState());
        System.out.println("Expected: 0");
        System.out.println("Lamp: " + wiring.getLampState());
        System.out.println("Expected: 0");
        
    }
}