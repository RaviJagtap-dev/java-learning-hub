package basics;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Temperature conversion in java

            Scanner sc = new Scanner(System.in);

            double temp;
            double newTemp;
            String unit;

            System.out.println("Enter the temperature");
            temp = sc.nextDouble();

            System.out.print("Convert TO Celsius to Fahrenheit? (C or F):");
            unit = sc.next().toUpperCase();

            newTemp=(unit.equals("C"))? (temp-32)*5/9 :(temp*5/9) +32;

            System.out.printf("%.1f° &s",newTemp,unit);

            sc.close();

    }
}
