
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instructor extends Person
{
    // instance variables - replace the example below with your own
    private double salary;

    /**
     * Constructor for objects of class Student
     */
    public Instructor(String name, int YOB, double salary)
    {
        super(name, YOB);
        
        this.salary = salary;
    }
    
    public String toString(){
        return "Student[super"+super.toString() + "],salary="+salary+"]"; 
    }

}
