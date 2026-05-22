package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        //****** Exception Handling in java *********

        // Exception handling== An event that interrupts the normal flow of program
        //                      (Dividing by zero, file not found, mismatch intput type)
        //                       surround with dangerous code with a try{} block
        //                       try{},catch{},finally{}.
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Enter the odd number :");
                int n = sc.nextInt();
                System.out.println(n);
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a number");
                sc.next();

            }
            finally {
                sc.nextLine();
            }

    }
}
