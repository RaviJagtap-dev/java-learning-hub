package oop.getterssetters;

public class GetterSetterDemo {
    public static void main(String[] args) {

        // ** getters and setters

            Car car =new Car("Mustang","Red","Ford",25000);

            car.setCompony("Toyota");
            car.setPrice(-1000);

            System.out.println(car.getColor()+" "+car.getModel()+" "+car.getCompony());

    }
}
