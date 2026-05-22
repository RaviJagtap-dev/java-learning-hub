package oop.composition;

public class CompositionDemo {
    public static void main(String[] args) {
        // *** Composition in java

        //composition= Represents a 'part-of' relationship between objects
        //             Ex. an engine as part of a car
        //             Allows the complex object to be constructed from small objects.

            Car car=new Car("mustang",1891,"V8");
            System.out.println(car.getModel());
            System.out.println(car.getYear());
            System.out.println(car.engine.type);

            car.start();
    }
}
