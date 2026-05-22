package threading;

import java.util.Scanner;

public class ThreadDemo {
    public static void main(String[] args) {
        // **** Threading  ******

        // Threading == It allows a program to run multiple tasks simultaneously
        //              Helps improve performance with the time-consuming operations
        //              (File I/O) network communications ,or any background tasks

        // How to create a thread
        // option 1=Extend the Thread Class(simpler)
        //option 2= Implement the runnable interface (better)

        Scanner sc=new Scanner(System.in);
        System.out.println("You have 5 seconds for Enter Your Name :");
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.setDaemon(true);
        t.start();
        System.out.println("Enter Your Name :");
        String name = sc.nextLine();
        t.interrupt();

        System.out.println("Hello " + name);

             sc.close();
    }
}
