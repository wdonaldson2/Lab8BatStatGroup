import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Created by william & Latasha  on 2/15/17.
 */
public class lab8A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int numBatters = 0;
        int atBat = 0;
        int baseSum = 0;

        System.out.println("How many batters are in the game? ");
        numBatters = scan.nextInt();

        System.out.println("How many at-Bats per game: ");
        atBat = scan.nextInt();


        do {
            //loop through the batters (rows)
            int[][] batStats = new int[numBatters][atBat];
            for (int row = 0; row < batStats.length; row++) {//this loop get numbatters

                int sum = 0;
                for (int col = 0; col < batStats[row].length; col++) {// atbats loop

                    System.out.println("Enter Player's number of at Bat's: " + (col + 1));

                    batStats[row][col] = scan.nextInt();

                }

                    int bases = 0;
                    int hits = 0;

                    for (int col = 0; col < batStats[row].length; col++) {//calc statistics

                        bases += batStats[row][col];
                        if (batStats[row][col] > 0) {
                            hits++;
                        }

                    }

                double batAverg = (double) hits / batStats[row].length;
                System.out.printf("For batter %d, Batting Average: %.3f", (row + 1), batAverg);

                double slugPercentage = (double) bases / batStats[row].length;
                System.out.printf("\tBatting Average: %.3f\n", slugPercentage);

                }
            System.out.println("Another batter? (y/n): ");
    } while (input.next().equalsIgnoreCase("Y")) ;
        input.close ();
    }
}


