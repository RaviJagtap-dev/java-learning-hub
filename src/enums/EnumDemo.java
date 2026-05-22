package enums;

import java.util.Scanner;

public class EnumDemo {
    public static void main(String[] args) {
        //******* Enums ************

        //Enums ==(Enumerations) A spacial kind of class that
        //        represents the foxed set of a constants.
        //        They improve the code readability and are easy to maintain
        //        More efficient with the switches when we're comparing strings

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a day of a week :");
            String response = sc.nextLine().toLowerCase();
            try{

                Day day =Day.valueOf(response);

                switch (day){
                    case friday,
                         monday,
                         tuesday ,
                         thursday,
                         wednesday->System.out.println("It is a week day");
                    case  saturday, sunday-> System.out.println("It is a weekend");
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            sc.close();
    }
}
