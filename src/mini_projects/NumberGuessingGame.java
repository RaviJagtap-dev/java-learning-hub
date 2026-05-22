package mini_projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // number guessing in java

            Random rand = new Random();
            Scanner input = new Scanner(System.in);

            int guess=0;
            int attempts = 0;
            int randNumber = rand.nextInt(1,10);

            System.out.println("Number Guessing Game :");
            System.out.println("Guess a number between 1-10");

            do {
                System.out.println("Enter a number between 1-10");
                guess = input.nextInt();
                attempts++;

                if (guess<randNumber) {
                    System.out.println("its to low please try again");
                }
                else if (guess>randNumber) {
                    System.out.println("its to high please try again");
                }
                else {
                    System.out.println("You guessed it! "+guess);
                    System.out.println("# The number attempts "+attempts);
                }

            }while(guess!=randNumber);

            input.close();
    }
}
