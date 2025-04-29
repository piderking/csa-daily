

    public class Daily extends Appointment
{
   public Daily (int month, int year, String description){
        super(month, 0, year, description);
    }
    
    public boolean occursOn(String date){
        String ret = getDescription() + ": \n";
        
        int days = 28;
        
        if (getYear() % 4 == 0 && getMonth() == 2){
            days = 29;
        } else if (getMonth() == 1 || getMonth() == 3 || getMonth() == 5 || getMonth() == 7 || getMonth() == 8 || getMonth() == 10 || getMonth() == 12){
            days = 31;
        } else {
            days = 30;
        }
        for (int day = 1; day <= days; day++){
            if (date.equals(getMonth() + "/" + day + "/" + getYear())){
                return true;
            }

        }
        
        return false;
    }

}


