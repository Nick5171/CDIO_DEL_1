package Die.Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int points_P1 = 0; // Points for player 1
        int points_P2 = 0; // Points for player 2
        int a = 0;
        int turn = 1; //Turn counter
        boolean pair;
        int sum;

        Die die1, die2; // The dice are created
        die1 = new Die();
        die2 = new Die();

        //Introduction and rule description
        System.out.println("Welcome to the dice game!");
        System.out.println("The rules are as following:");
        System.out.println("Player 1 throws the two dice - the sum of the dice is then added to the score of player 1");
        System.out.println("Player 2  throws the two dice - the sum of the dice is then added to the score of player 2");
        System.out.println("Player 1 always starts the game");
        System.out.println("The first player to reach a score of 40 or above wins the game, good luck! \n");


        System.out.println("Enter the name of player 1");
        Scanner scanner = new Scanner(System.in);
        String playerName_P1 = scanner.next();

        System.out.println("Enter the name of player 2");
        String playerName_P2 = scanner.next();

        while (a == 0){
            // Player 1's turn
            System.out.println("Turn " + turn + ":");
            System.out.println("Enter anything to throw " + playerName_P1 + "'s dice");
            scanner.next();
            System.out.println(playerName_P1 + " rolls the Dice");
            die1.roll();
            die2.roll();
            pair= getPair(die1.getFaceValue(), die2.getFaceValue());
            sum = getSum(die1.getFaceValue(), die2.getFaceValue());
            points_P1 = sum + points_P1;
            System.out.println("Die 1: " + die1.getFaceValue() + "\n" + "Die 2: " + die2.getFaceValue());
            System.out.println("Their sum is: " + sum);
            System.out.println("Total points for player 1 are: " + points_P1);
            System.out.println();
            if (points_P1 >= 40)
                a=1;
            if (points_P1 >= 40) // Stops while loop if player 1 reaches 40 or more points
                break;

            //Player 2's turn
            System.out.println("Enter anything to throw " + playerName_P2 + "'s dice");
            scanner.next();
            System.out.println(playerName_P2 + " rolls the Dice");
            die1.roll();
            die2.roll();
            pair= getPair(die1.getFaceValue(), die2.getFaceValue());
            sum = getSum(die1.getFaceValue(), die2.getFaceValue());
            points_P2 = sum + points_P2;
            System.out.println("Die 1: " + die1.getFaceValue() + "\n" + "Die 2: " + die2.getFaceValue());
            System.out.println("Their sum is: " + sum);
            System.out.println("Total points for player 2 are: " + points_P2);
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------");
            turn++;

            if (points_P2 >= 40) // Stops while loop if player 2 has 40 or more points
                a = 1;
        }
        if (points_P1 > points_P2) // Prints what player won
            System.out.println("Player 1 wins!");
        else
            System.out.println("Player 2 wins!");
    }

    public static boolean getPair(int die1, int die2) {

        return die1 == die2;
    }
    public static int getSum(int die1, int die2 ){

        return die1 + die2;
    }
}