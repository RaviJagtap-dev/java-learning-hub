package basics;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        // The compound interest calculater

            Scanner input = new Scanner(System.in);

            double principle;
            double rate;
            int timesCompound;
            int year;
            double amount;

            System.out.println("Enter the principle amount:");
            principle = input.nextDouble();

            System.out.println("Enter the interest rate:(in %)");
            rate = input.nextDouble()/100;

            System.out.println("Enter the timesCompound per year:");
            timesCompound = input.nextInt();

            System.out.println("Enter the year:");
            year = input.nextInt();

            amount =principle*Math.pow(1+rate/timesCompound,timesCompound*year);

            System.out.printf("Your amount after %d years is % .2f",year,amount);


            input.nextLine();
    }
}
