package basics;

import java.util.Scanner;

public class EnhancedSwitchDemo {
    public static void main(String[] args) {

         //Enhanced switches= A replacement of many if else statement

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter The day of the week : ");
            String day = sc.nextLine();

            switch (day) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                        System.out.println("It is a week day:");
                case "Saturday","Sunday"->
                        System.out.println("It is a weekend:");
                default ->
                    System.out.println(" is not a day!!!");
            }
    }
}
