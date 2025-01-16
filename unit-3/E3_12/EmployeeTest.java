package E3_12;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import E3_12.Employee;
/**
 * The test class EmployeeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EmployeeTest
{
    /**
     * Default constructor for test class EmployeeTest
     */
    private Employee harry;
    
    public EmployeeTest()
    {
        harry = new Employee("Hacker, Harry", 50000);
        
        
    }
    
    @Test
    public void EmployeeTest(){
        

        System.out.println(harry.getName());
        
        System.out.println(harry.getSalary());
        harry.raiseSalary(10);
        System.out.println(harry.getSalary());
    
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
