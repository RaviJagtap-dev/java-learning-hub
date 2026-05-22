package basics;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {

        // while loops = Repeat code untile the condition is not true
        // while some condition remains  true

            Scanner sc = new Scanner(System.in);

            String name="";

            while(name.isEmpty()){
                System.out.print("Enter your name: ");
                name = sc.nextLine();


            }
            System.out.println("Hello "+name);

            String Response="";

                while (!Response.equals("Q")) {
                    System.out.println("hello Ravi");
                    System.out.println("You are Stuck in the loop !!!");
                    System.out.println("Press Q to stop ");
                    Response=sc.nextLine().toUpperCase();

                }
            System.out.println("You have quit the game");

                sc.close();
    }
}
