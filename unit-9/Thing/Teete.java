package Thing;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teete
{
    public static void main (String[] args){
    
        Thing[] arr = new Thing[3];
        
        arr[0] = new Thing();
        arr[1] = new MoreThing();
        arr[2] = new OtherThing();
        
        
        for (Thing t : arr){
            t.hi();
            t.hello();
        }
    }
}
