package composition;

public class CompositionDemo {

    public static void main(String[] args) {

        Car car = new Car("mustang",1891,"V8");

        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.engine.type);

        car.start();
    }
}