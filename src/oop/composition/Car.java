package oop.composition;

public class Car {

    String model;
    int year;

    Engine engine;

    public Car(String model, int year, String type) {

        this.model = model;
        this.year = year;

        this.engine = new Engine(type);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    void start() {
        engine.start();
        System.out.println(model + " started");
    }
}