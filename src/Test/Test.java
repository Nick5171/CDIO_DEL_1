package Test;

import Die.Game.Die;

import java.text.DecimalFormat;

public class Test {

    public static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Die die1, die2;
        die1 = new Die();
        die2 = new Die();
        int points_P1 = 0; // Points for player 1
        int a = 0;
        boolean pair;
        int sum;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int sum9 = 0;
        int sum10 = 0;
        int sum11 = 0;
        int sum12 = 0;
        int isPair = 0;
        int i;
        double Throws = 0;


        for (i = 0; i < 100000; i++) {

            while (a == 0){

                // Player 1's turn
                die1.roll();
                die2.roll();
                Throws++;
                pair = getPair(die1.getFaceValue(), die2.getFaceValue());
                sum = getSum(die1.getFaceValue(), die2.getFaceValue());
                points_P1 = sum + points_P1;
                if (points_P1 >= 40) {
                    a = 1;
                    points_P1 = 0;
                }

                if (pair) // Counts if dice thrown is a pair or not
                    isPair++;

                switch (sum) { // Counts amount of times a given sum is thrown
                    case 2:
                        sum2++;
                        break;
                    case 3:
                        sum3++;
                        break;
                    case 4:
                        sum4++;
                        break;
                    case 5:
                        sum5++;
                        break;
                    case 6:
                        sum6++;
                        break;
                    case 7:
                        sum7++;
                        break;
                    case 8:
                        sum8++;
                        break;
                    case 9:
                        sum9++;
                        break;
                    case 10:
                        sum10++;
                        break;
                    case 11:
                        sum11++;
                        break;
                    case 12:
                        sum12++;
                        break;

                }

            }
            a--; // Resets while loop condition "a" to 0 for every for loop iteration

        }

        System.out.println("Total throws: " + Throws);
        System.out.println("Over the course of " + i + " games played:");
        System.out.println("The sum of 2 is thrown " + sum2 + " times which makes up " + df.format((sum2 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 3 is thrown " + sum3 + " times which makes up " + df.format((sum3 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 4 is thrown " + sum4 + " times which makes up " + df.format((sum4 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 5 is thrown " + sum5 + " times which makes up " + df.format((sum5 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 6 is thrown " + sum6 + " times which makes up " + df.format((sum6 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 7 is thrown " + sum7 + " times which makes up " + df.format((sum7 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 8 is thrown " + sum8 + " times which makes up " + df.format((sum8 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 9 is thrown " + sum9 + " times which makes up " + df.format((sum9 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 10 is thrown " + sum10 + " times which makes up " + df.format((sum10 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 11 is thrown " + sum11 + " times which makes up " + df.format((sum11 / Throws) * 100) + "% of the total throws made");
        System.out.println("The sum of 12 is thrown " + sum12 + " times which makes up " + df.format((sum12 / Throws) * 100) + "% of the total throws made");
        System.out.println();
        System.out.println("Pairs have been thrown " + isPair + " times which makes up " + df.format((isPair / Throws) * 100) + "% of the total throws made");




    }
    public static boolean getPair ( int die1, int die2){

        return die1 == die2;
    }
    public static int getSum ( int die1, int die2 ){

        return die1 + die2;
    }
}