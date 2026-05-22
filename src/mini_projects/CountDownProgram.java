package mini_projects;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownProgram {
    public static void main(String[] args) {
        // ************* Countdown timer using java *****

        // JAVA Countdown Timer Program

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to countdown from :");
             int number = sc.nextInt();

            Timer timer = new Timer();

            TimerTask timerTask = new TimerTask() {
                int n =number;
                @Override
                public void run() {
                    System.out.println(n);
                        n--;

                    if(n==0){
                        System.out.println("Happy new Year");
                        timer.cancel();
                    }
                }
            };
            timer.schedule(timerTask, 1000, 1000);//(task,delay,period)

    }
}
