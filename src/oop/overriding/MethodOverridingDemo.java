package oop.overriding;

public class MethodOverridingDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("SHERU");
        Cat cat = new Cat("KAJOL");

        dog.isSwim();
        cat.isSwim();
    }
}