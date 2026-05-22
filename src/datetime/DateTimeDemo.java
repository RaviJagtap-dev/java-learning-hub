package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {

        //*** dates & times

        // How to work with dates and time with java
        // (LocalDate,LocalTime,LocalDateTime, UTC Timestamp)

            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();
            System.out.println(time);
            System.out.println(date);

            LocalDateTime dateTime = LocalDateTime.now();
            System.out.println(dateTime);


    }
}
