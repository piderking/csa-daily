
/**
 * Write a description of class ReplaceThing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReplaceThing
{
    // instance variables - replace the example below with your own
    private String str;

    /**
     * Constructor for objects of class ReplaceThing
     */
    public ReplaceThing()
    {
        // initialise instance variables
        str = "Hello World!";
        str = str.replace("e", "$").replace("o", "e").replace("$", "o");
    }
}