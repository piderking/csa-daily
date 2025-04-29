

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class P6_6Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class P6_6Test
{
    /**
     * Default constructor for test class P6_6Test
     */
    public P6_6Test()
    {
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
    @Test
    public void test(){
        E6_3.replaceVowels("4sdfsdfsdfsdfsdfsdf");
        E6_3.replaceVowels("sdfsdfoosdfosdof");
    }
}
