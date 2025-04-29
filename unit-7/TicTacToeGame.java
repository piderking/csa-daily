import java.util.Scanner;  // Import the Scanner class
/**
 * Write a description of class TicTacToeGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToeGame
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);  // Create a Scanner object

        TicTacToe game = new TicTacToe();
        
        while(game.getWinner() == 0){
            
            while (true && game.getWinner() == 0){
                game.printGameState();
                System.out.println("Player1 Input Command");
                if (in.hasNextInt()){
                    if (game.playPlayer1(in.nextInt())) break;
                    System.out.println("Faulty Move, input new move");
                }
                System.out.println("Faulty Move, input new move");

            }
             while (true && game.getWinner() == 0){
                game.printGameState();

                System.out.println("Player2 Input Command");
                if (in.hasNextInt()){
                    if (game.playPlayer2(in.nextInt())) break;
                    System.out.println("Faulty Move, input new move");
                }
                System.out.println("Faulty Move, input new move");

            }


        }
        
        System.out.println("\n\n\n");
        game.printGameState();
        System.out.println("Game Winner is: " + game.getWinner());
        
    }
}
