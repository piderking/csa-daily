
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    // instance variables - replace the example below with your own
    private String feild;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int YOB, String feild)
    {
        super(name, YOB);
        
        this.feild = feild;
    }
    
    public String toString(){
        return "Student[super"+super.toString() + "],major="+feild+"]"; 
    }

}
