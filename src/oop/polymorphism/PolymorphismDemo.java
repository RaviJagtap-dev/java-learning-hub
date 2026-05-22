package oop.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {

            //*** POLYMORPHISM ************

        // polymorphism = "Poly"="Many"
        //                 "MORPH" = "SHAPE"
        //                 Objects can identify as other objects
        //                 Objects can be treated as objects of a superclass


           Truck truck = new Truck();
           Boat boat = new Boat();
           Bike bike = new Bike();

           Vehicle[] vehicles={truck,boat,bike};

           for (Vehicle vehicle : vehicles) {
               vehicle.getSpeed();
           }

    }
}
