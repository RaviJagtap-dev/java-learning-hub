package threading;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo {

    public static void main(String[] args) {

        // ****** TimerTask Demo ******

        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {

            int count = 3;

            @Override
            public void run() {

                System.out.println("Hello World");

                count--;

                if (count == 0) {

                    System.out.println("Task Completed");

                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 1000, 1000);
    }
}