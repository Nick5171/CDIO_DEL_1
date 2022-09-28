public class Test {
    public static void main(String[] args) {
        Die die1, die2;
        die1 = new Die();
        die2 = new Die();
        int points_P1 = 0; // Points for player 1
        int points_P2 = 0; // Points for player 2
        int a = 0;
        int turn = 1; //Turn counter
        boolean pair;
        int sum;
        int sum2 =0;
        int sum3 =0;
        int sum4 =0;
        int sum5 =0;
        int sum6 =0;
        int sum7 =0;
        int sum8 =0;
        int sum9 =0;
        int sum10 =0;
        int sum11 =0;
        int sum12 =0;

        int ispair = 0;
        int notpair = 0;




        for(int i = 0; i < 1000; i++) {

            while (a == 0){
                // Player 1's turn
                die1.roll();
                die2.roll();
                pair= getPair(die1.getFaceValue(), die2.getFaceValue());
                sum = getSum(die1.getFaceValue(), die2.getFaceValue());
                points_P1 = sum + points_P1;
                if (points_P1 >= 40)
                    a=1;

                //Player 2's turn
                die1.roll();
                die2.roll();
                pair= getPair(die1.getFaceValue(), die2.getFaceValue());
                sum = getSum(die1.getFaceValue(), die2.getFaceValue());
                points_P2 = sum + points_P2;
                turn++;

                if (points_P2 >= 40) // Stops while loop if one player has 40 or more points
                    a = 1;

                if (pair) // Counts if dice thrown is a pair or not
                    ispair++;
                else
                    notpair++;

                switch (sum){ // Counts amount of times a given sum is thrown
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
        System.out.println("Over the course of 1000 games played:");
        System.out.println("The sum of 2 is thrown " + sum2 + " times");
        System.out.println("The sum of 3 is thrown " + sum3 + " times");
        System.out.println("The sum of 4 is thrown " + sum4 + " times");
        System.out.println("The sum of 5 is thrown " + sum5 + " times");
        System.out.println("The sum of 6 is thrown " + sum6 + " times");
        System.out.println("The sum of 7 is thrown " + sum7 + " times");
        System.out.println("The sum of 8 is thrown " + sum8 + " times");
        System.out.println("The sum of 9 is thrown " + sum9 + " times");
        System.out.println("The sum of 10 is thrown " + sum10 + " times");
        System.out.println("The sum of 11 is thrown " + sum11 + " times");
        System.out.println("The sum of 12 is thrown " + sum12 + " times");
        System.out.println();
        System.out.println("Pairs have been thrown " + ispair + " times");



    }
    public static boolean getPair(int die1, int die2) {

        return die1 == die2;
    }
    public static int getSum(int die1, int die2 ){

        return die1 + die2;
    }
}

