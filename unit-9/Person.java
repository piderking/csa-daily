
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int YOB;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int YOB)
    {
        // initialise instance variables
        this.name = name;
        this.YOB = YOB;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        // put your code here
        return "Person[name="+name+",birthYear="+YOB+"]";
    }
}
