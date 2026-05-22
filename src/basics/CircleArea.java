package basics;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

                // calculate the area of the circle

                double dimeter;
                double radius;
                double constant=3.14;

                Scanner scanner =new Scanner(System.in);

                System.out.println("Enter the dimeter of the circle: ");
                dimeter=scanner.nextDouble();
                dimeter=scanner.nextDouble();

                // first we have to calculate the radius of the circle then we can calculate the area of the circle
                // the radius of the circle is double of dimeter

                radius=dimeter/2;
                System.out.println("radius of the circle is "+radius);

                // here the area of the circle =2*constant*(radius*radius)

                double circumference=2*constant*(radius*radius);
                System.out.println("circumference of the circle is "+circumference);

                scanner.close();
    }
}
