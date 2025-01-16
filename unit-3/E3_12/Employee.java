package E3_12;


/**
 * Write a description of class Employee here.
 *
 * @author (Peter Bowman)
 * 
 */
public class Employee
{
    
    private String name;
    private double salary;
  

    /**
     * Constructor for objects of class Employee
     * @param Name of Employee
     * @param Salary of Employee
     */
    public Employee(String Name, double Salary)
    {
        // initialise instance variablesx = 0;
        this.name=Name;
        this.salary=Salary;
    }
    /**
     * Get the name of the employee
     * @return Name of the employee
     */
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double byPercent){
        salary += salary * (Math.abs(byPercent) / 100);
    }
}
