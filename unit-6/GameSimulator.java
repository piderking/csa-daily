
/**
 * Write a description of class E6_9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameSimulator
{
    private int wins = 0;
    private int times;
    public double getWinPercent(){
        System.out.println("" + wins + " " + times);
        return ((double) wins)/((double) (times-wins));
    }
    public GameSimulator(int times)
    {
        this.times = times;
        


    }
    public void runDoubleDieSimulation(){
        this.wins = 0;
        for (int x = 0; x < this.times; x++){
            this.wins += rollTwoPairs();
        }
        //System.out.println("Wins: " + wins);
        //System.out.println("Losses: " + (times-wins));
        //System.out.println("Win Rate " + ((double) wins/((double) times-wins)*100) + "%" );
    }
    public void runSingleDieSimulation(){
        this.wins = 0;
        for (int x = 0; x < this.times; x++){
            this.wins += rollForSix();
        }
        //System.out.println("Wins: " + wins);
        //System.out.println("Losses: " + (times-wins));
        //System.out.println("Win Rate " + ((double) wins/((double) times-wins)*100) + "%" );
    }
     public static int rollForSix(){
        int num_of_six = 0;
        for (int x = 0; x < 4; x++){
            if ((int) Math.floor(Math.random() * 6) == 5 ){
                num_of_six++;
            }
        }
        if (num_of_six > 1){
        return 1;}
        return 0;
    }
    public static int rollTwoPairs(){
        int num_of_six = 0;
        for (int x = 0; x < 24; x++){
            if ((int) Math.floor(Math.random() * 6) == 5 && (int) Math.floor(Math.random() * 6) == 5 ){
                num_of_six++;
            }
        }
        if (num_of_six > 1){
        return 1;}
        return 0;
    }
    
}
