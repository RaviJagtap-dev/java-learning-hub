package mini_projects.finalproject;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlarmClockMain {
    public static void main(String[] args) {
        // *** Final Project ******

        // ** JAVA ALARM CLOCK ***
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime=null;

        while (alarmTime==null) {
            try {
                System.out.print("Enter an alarm time(HH:mm:ss):");
                String time = sc.nextLine();

                alarmTime = LocalTime.parse(time, dtf);
                System.out.println("Alarm time set for : " + alarmTime);
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Invalid format / Enter valid format");
            }
        }

        AlarmClockMain alarmClock = new AlarmClockMain(alarmTime);
        Thread alarmClockThread = new Thread(alarmClock);
        alarmClockThread.start();

        sc.close();
    }
}
