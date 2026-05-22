package basics;

import java.util.Scanner;

public class NestedLoopDemo {
    public static void main(String[] args) {


        // # Nested loop in java
        //nested loop =  A loop inside the another loop used often with the matrices and dsa

            for(int i=0;i<=3;i++){
                for(int j=0;j<=10;j++) {
                    System.out.print(j +" ");
                }
                System.out.println(" ");
            }

         //mini project for nested loops

            Scanner sc = new Scanner(System.in);

            int rows;
            int cols;
            char symbols;

            System.out.print("Enter the number of rows :");
            rows = sc.nextInt();

            System.out.print("Enter the number of columns :");
            cols = sc.nextInt();

            System.out.print("Enter the symbols :");
            symbols = sc.next().charAt(0);

            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    System.out.print(symbols+"   ");

                }
                System.out.println("  ");
            }


                 sc.close();
    }
}
