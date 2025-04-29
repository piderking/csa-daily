import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays; // import the ArrayList class

/**
 * Write a description of class Solitaire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Piles
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> game = new ArrayList<Integer>();
    /**
     * Constructor for objects of class Solitaire
     */
    public Piles(int[] game)
    {
        for (int x = 0; x < game.length; x ++){
            this.game.add(game[x]);
        }
        
    }
    public String toString(){
        String s = "[";
        for (int i = 0; i < game.size(); i++){
            s += game.get(i);
            s += " ";
        }
        s+="]";
        
        return s;
        
    }
    public void playRound(){
        int s = game.size();
        
        int i = 0;
        while (i < game.size()){
            game.set(i, game.get(i) - 1);
            if (game.get(i) <= 0){
                game.remove(i);
            } else {
                i++;
            }
        }
        
        game.add(s);
    }
}
