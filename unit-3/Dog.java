
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    // instance variables - replace the example below with your own
    private int weight;
    private String color;
    private String name;

        
    /**
     * Constructor for objects of class Dog
     */
    public Dog(String name, int weight, String color)
    {
        // initialise instance variables
        weight = weight;
        color = color;
        name = name;
    }

    public void feed(){
        weight += 1;
    }
    
    public void changeName(String newName){
        name = newName;
    
    }
    
}
