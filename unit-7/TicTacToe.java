
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    // instance variables - replace the example below with your own
    private char[][] game;
    private int turn_num = 0;
    private boolean player1_turn = true;
    
    /**
     * Constructor for objects of class TicTacToe
     */
    public TicTacToe()
    {
        this.game = new char[3][3];
        
        
    }
    public boolean playPlayer1(int position) {
        /* 
        
         * 0 1 2
         * 3 4 5
         * 6 7 8
        */

       if (this.player1_turn && game[position/3][position%3] == '\u0000'){
         game[position/3][position%3] = 'x';
         player1_turn = false;
         return true;
        }
        return false;
    }
     public boolean playPlayer2(int position) {
        /* 
        
         * 0 1 2
         * 3 4 5
         * 6 7 8
        */
       if (!this.player1_turn && game[position/3][position%3] == '\u0000'){
         game[position/3][position%3] = 'o';
         player1_turn = true;
         return true;
        }
        return false;
    }
    
    public int getWinner(){
        // return 0 if no winner
        if (checkWinner('x')) return 1;
        else if (checkWinner('o')) return 2;
        return 0;
    }
    public void printGameState(){
        for (int x = 0; x < game.length; x++){
            System.out.print("| ");

            for (int y = 0; y < game[x].length; y++){
                if (game[x][y] == 'x') System.out.print("X");
                else if (game[x][y] == 'o') System.out.print("O");
                else System.out.print('-');
                
                System.out.print(" ");

            }
            System.out.println("|");

        }

    }
    public boolean checkWinner(char ch){
        int[][] gm = new int[game.length][game[0].length];
        
        for (int y = 0; y < game.length; y++){
            for (int x = 0; x < game[y].length; x++){
                if (game[y][x] == ch){
                    gm[y][x] = 1;
                }
            }
        }
        
        // check sums of lines
        int sum = 0;
        for (int x = 0; x < game.length; x++){
            sum += gm[x][x];
        }
        if (sum == game.length) return true;
        
        sum = 0;
        for (int x = 0; x < game.length; x++){
            sum += gm[game.length-1-x][game.length-1-x];
        }
        if (sum == game.length) return true;
        
        // rows
        for (int x = 0; x < game.length; x++){
            if (game[x][0] == ch && game[x][1] == ch && game[x][2] == ch){
                return true;
            }
        }
        
        // rows
        for (int x = 0; x < game.length; x++){
            if (game[0][x] == ch && game[1][x] == ch && game[2][x] == ch){
                return true;
            }
        }
        
        return false;
    }


}
