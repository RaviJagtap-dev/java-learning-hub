package mini_projects;

import java.util.Scanner;

public class BankingProgram {

   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // ************** JAVA BANKING PROGRAM FOR BEGINNERS *****************

        // declare variables

            double balance=0;
            boolean isRunning =true;
            int choice;

            // Display Menu
            while(isRunning){


            System.out.println("****************************************");
            System.out.println("\t1.Show Balance :");
            System.out.println("\t2.Add Balance :");
            System.out.println("\t3.Withdraw Balance :");
            System.out.println("\t4.Exit !!!! ");
            System.out.println("***************************************\n");

            System.out.print("Enter your choice (1-4):");
            choice = sc.nextInt();

            // Get and process user choice
            switch (choice) {
                case 1 ->showBalance(balance);
                case 2 ->  balance+= addBalance();
                case 3 -> balance-=withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
       }
            System.out.println("****************************");
            System.out.println("Thanks For visiting Have a nice day");
            System.out.println("*****************************");


        }
        // showBalance();

        static void  showBalance (double balance){
            System.out.printf("Current balance is :$%.2f \n",balance);
            if (balance >= 100){
                System.out.println("Your balance is :$"+balance);
            }
            else if(balance < 100){
                System.out.println("Your balance is very low :$"+balance);
            }

        }
        // deposite();

        static double addBalance (){
            System.out.println("Enter amount to add :");
            double amount = sc.nextDouble();

            if (amount < 0){
                System.out.println("amount can't be negative");
                    return 0;
            }
            else{
                System.out.printf(" $%.3f Amount is added :\n",amount);
                return amount;

            }

        }
        // withdraw():

        static double withdraw (double balance){
            double amount;

            System.out.print("Enter amount to withdraw :");
             amount = sc.nextDouble();

            if(amount > balance){
                System.out.println("Insufficient funds");
                return 0;
            }
            else if(amount < 0){
                System.out.println("amount can't be negative");
                return 0;
            }
            else{

                return amount;

            }
    }
}
