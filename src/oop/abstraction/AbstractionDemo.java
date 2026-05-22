package oop.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        //*** abstraction in java *****

        // abstract= use to define abstract class and methods
        //          Abstraction is the process of hiding implementation details
        //          and showing only essential features
        //          abstract class cant be instantiated directly
        //          can contain 'abstract' methods (which must be implemented)
        //          can contain concrete methods (which are inherited )

           Circle circle = new Circle(2.5);
           Triangle triangle = new Triangle(5.5,2.5);
           Rectangle rectangle = new Rectangle(5,4);


            System.out.println(circle.getArea());
            System.out.println(triangle.getArea());
            System.out.println(rectangle.getArea());

    }
}
