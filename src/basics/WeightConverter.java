package basics;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // WEIGHT CONVERTOR

            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("\t <<<Weight Conversion Program>>>\n");
                System.out.println("Which type of Conversion do you want to convert?");
                System.out.println("1. Convert lbs to kgs :");
                System.out.println("2. Convert kgs to lbs :");

                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("You have select option 1 so you want to convert lbs to kgs");
                        System.out.println("Enter the weight  to convert lbs to kgs:");
                        double lbs = input.nextDouble();

                        //lbs-->kg==weight*0.45
                        //kgs-->lbs==weight*2.20

                        double kgs = lbs * 0.45;
                        System.out.println("You have " + lbs + " lbs to convert in kgs" + kgs + " ");

                        break;
                    case 2:
                        System.out.println("You have select option 2 so you want to convert kgs to lbs");
                        System.out.println("Enter the weight in kg to convert kgs to lbs:");
                        double kgs2 = input.nextDouble();

                        double lbs2 = kgs2 * 2.20;
                        System.out.printf("You have %.2f kg to convert in lbs is: %.2f\n",kgs2,lbs2);
                        break;
                }


                input.nextLine();

            }
    }
}
