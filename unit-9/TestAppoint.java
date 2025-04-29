
/**
 * Write a description of class TestAppoint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestAppoint
{
    public static void main(String[] args){
    
        String[] dates = {"5/13/2008", "5/13/2009", "11/14/1946", "1/1/2025"};
        
        Daily daily = new Daily(5, 2008, "My birthday");
        Monthly month = new Monthly(1, 2025, "First day of the month");
        Onetime onetime = new Onetime(5, 13, 2009, "Birthday");
        
        for (String date : dates){
            System.out.println(date);
            if (daily.occursOn(date)){
                System.out.println("\t Occurs on daily ");
            }
            if (month.occursOn(date)){
                System.out.println("\t Occurs on monthly ");
            }
            if (onetime.occursOn(date)){
                System.out.println("\t Occurs one time ");
            }
        
        }
    }
    
}
