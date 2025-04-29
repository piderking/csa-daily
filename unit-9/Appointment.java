import java.util.Date;
/**
 * Write a description of class Appointment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Appointment
{
    // instance variables - replace the example below with your own
    private int year;
    private int month; 
    private int day;
    private String description;
    /**
     * Constructor for objects of class Appointment
     */
    public Appointment(int month, int day, int year, String description)
    {
        this.month = month;
        this.day = day;
        this.year = year;
        this.description = description;
    }

    public boolean occursOn(String date){
        return date.equals(month + "/" + day + "/" + year);
    }
    
    public String getDescription(){
        return description;
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
}
