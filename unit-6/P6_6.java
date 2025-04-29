
/**
 * Write a description of class P6_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P6_6
{
    // instance variables - replace the example below with your own
    private int x = 0;
    private int y = 0;

    /**
     * Constructor for objects of class P6_6
     */
    public P6_6(int times)
    {
        // initialise instance variables
        for (int x = 0; x < times; x++){
            int i = (int) Math.floor(Math.random() * 4);
            System.out.println(i);
            if (i == 0){
                x++;
            } else if (i == 1){
                x--;
            } else if (i == 2){
                y++;
            } else {
                y--;
            }
        }
    }

    public String getPosition(){
        return "("+x+","+y+")";
    }
}
