package E4_16;

public class MilitaryTime {

    public static void main(String[] args) {
        int time1 = 900;
        int time2 = 1730;

        time1 = time1/100*60 + time1%100;
        time2 = time2/100*60 + time2%100;

        int ftime = Math.max(0, time2-time1) + ((24*60 - time1 + time2)*Math.max(time1-time2, 0))/Math.max(time1-time2, 1) ; 
        System.out.println((ftime/60) + " hours " + (ftime%60) + " minutes ");
    }
}
