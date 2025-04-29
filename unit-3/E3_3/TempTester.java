package E3_3;
import E3_3.RangeInput;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TempTester
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int lower;
        int upper;
        System.out.println("This program illustrates constructing and staying within a range of values\n");
        System.out.println("Enter the lower and upper bound for your range");
        System.out.println("The lower bound should be less than"
                + "or equal to the upper boung");
        do
        {
            System.out.print("Enter the minimum value for the range: ");
            lower = in.nextInt();
            System.out.print("Enter the maximum value for the range: ");
            upper = in.nextInt();
            String skip = in.nextLine(); // skip remaining characters on the line

        } while (lower > upper);
        RangeInput rangeInput = new RangeInput(lower, upper);
        String command;
        System.out.println("Current value is " + rangeInput.getCurrent());
        System.out.println("Enter command [u=up, d=down, q=quit]");
        command = in.nextLine();
        while (!command.equalsIgnoreCase("q"))
        {
            if (command.equalsIgnoreCase("u"))
            {
                rangeInput.up();
            } else if (command.equalsIgnoreCase("d"))
            {
                rangeInput.down();
            } else
            {
                System.err.println("Your input must be u or d or q");
            }
            System.out.println("Current value is " + rangeInput.getCurrent());
            command = in.nextLine();
        }
        System.out.println("Done!");
    }

}