package mini_projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // ********* Rock Paper seasors ************

        //Declare variables
            Scanner sc=new Scanner(System.in);
            Random rand = new Random();

            String[] choices={"rock","paper","scissors"};
            String playerChoice;
            String computerChoice;
            String playAgain="yes";
            String exit="yes";

            do {
                System.out.println("**********************************");
                System.out.println("Welcome to Rock, Paper, Scissors!");
                System.out.println("**********************************");

                System.out.print("Enter your choice(rock, paper, scissors): ");
                playerChoice = sc.nextLine().toLowerCase();

                if(!playerChoice.equals("rock")&& !playerChoice.equals("paper")&& !playerChoice.equals("scissors")){
                    System.out.println("Invalid choice.");
                    continue;

                }
                computerChoice = choices[rand.nextInt(choices.length)];
                System.out.println("Computer Choice is:"+computerChoice);

                if(playerChoice.equals(computerChoice)){
                    System.out.println("Its a tie");

                } else if ((playerChoice.equals("rock")&&computerChoice.equals("paper"))
                        || (playerChoice.equals("scissors")&&computerChoice.equals("paper"))
                        ||(playerChoice.equals("rock")&&computerChoice.equals("scissors"))) {
                    System.out.println(" ");
                    System.out.println(" Congratulations You win!");
                }
                else {
                    System.out.println("You Loose !!Computer win!");
                }

                System.out.println("If you want to exit type yes or you want to continue tye no :(yes/no)");
                exit=sc.nextLine();
                if(exit.equals("yes")){
                    return;
                }else {
                    System.out.println("You want to play again ::(yes/no)");
                    playAgain = sc.nextLine().toLowerCase();
                }

            }while (playAgain.equals("yes"));
            System.out.println("Thanks for playing!");
    }
}
