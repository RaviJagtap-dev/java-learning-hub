package mini_projects;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // ************* Dice Roller Program *************

        Random rand = new Random();

        int noOfDice;

        int total = 0;

        // Get number of dice from user

        System.out.print("Enter the # dice to roll : ");

        noOfDice = sc.nextInt();

        // Check if dice > 0

        if (noOfDice > 0) {

            for (int i = 1; i <= noOfDice; i++) {

                // Roll dice

                int roll = rand.nextInt(1, 7);

                System.out.println("You rolled : " + roll);

                printDice(roll);

                total += roll;
            }

            System.out.println("Total : " + total);
        }

        else {

            System.out.println("Dice must be greater than 0");
        }

        sc.close();
    }

    // Display ASCII Dice

    static void printDice(int roll) {

        String dice1 = """
                 -----
                |     |
                |  o  |
                |     |
                 -----
                """;

        String dice2 = """
                 -----
                | o   |
                |     |
                |   o |
                 -----
                """;

        String dice3 = """
                 -----
                | o   |
                |  o  |
                |   o |
                 -----
                """;

        String dice4 = """
                 -----
                | o o |
                |     |
                | o o |
                 -----
                """;

        String dice5 = """
                 -----
                | o o |
                |  o  |
                | o o |
                 -----
                """;

        String dice6 = """
                 -----
                | o o |
                | o o |
                | o o |
                 -----
                """;

        switch (roll) {

            case 1 -> System.out.println(dice1);

            case 2 -> System.out.println(dice2);

            case 3 -> System.out.println(dice3);

            case 4 -> System.out.println(dice4);

            case 5 -> System.out.println(dice5);

            case 6 -> System.out.println(dice6);
        }
    }
}