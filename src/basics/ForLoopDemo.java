package basics;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) throws InterruptedException {
        // For loops in java

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter how many times you want to loop :");
            int times = sc.nextInt();

            for(int i = 2; i < times; i+=2) {
                System.out.println(i);
            }



            System.out.println("Enter The number from count down starts::");
            int start=sc.nextInt();

            for (int i=start;i>0;i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
            System.out.println("HAPPY NEW YEAR !!!!!");
    }
}
