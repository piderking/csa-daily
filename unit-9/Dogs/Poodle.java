
package Dogs;
/**
 * Example of using inheritance 
 *
 * @author Lewin
 * @version 1.1
 */
public class Poodle extends Dog 
{
    // instance variables - replace the example below with your own
    boolean registered; 
    
    /**
     * Constructor for objects of class dog
     */
    public Poodle(){ 
        super(4, 10, "Brown", "default", "poodle" );  
        
        registered = false; 
    }
    public Poodle(int size, String color, String name)
    {
        // initialise instance variables
       super(4, size, color, name, "poodle");  
       
        
    }

   
    public void  bark (int sound)
    {
        // put your code here
        System.out.print(name + " has barked"); 
    }
    // public String toString()
    // { 
        // return " this is a dog named " + name; 
     // }
}
