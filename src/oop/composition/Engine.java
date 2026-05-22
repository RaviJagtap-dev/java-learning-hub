package oop.composition;

public class Engine {

    String type;

    public Engine(String type) {
        this.type = type;
    }

    void start() {
        System.out.println(type + " engine started");
    }
}