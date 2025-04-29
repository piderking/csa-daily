public class Monthly extends Appointment
{
   public Monthly (int day, int year, String description){
        super(0, day, year, description);
    }
    
    public boolean occursOn(String date){
        
        
        
        for (int month = 1; month <= 12; month++){
            int days = 28;

            if (getYear() % 4 == 0 && month == 2){
            days = 29;
            } else if ( month == 1 ||  month == 3 || month == 5 ||  month == 7 || month == 8 ||  month == 10 ||  month == 12){
                days = 31;
            } else {
                days = 30;
            }
            
            if (getDay() > days){
                throw new RuntimeException(month + " doesn't have " + getDay() + "amount of days, only " + days);
            }
            if (date.equals(month  + "/" + getDay() + "/" + getYear())){
                return true;
            }

        }
        
        return false;
    }

}


