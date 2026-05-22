package oop.overriding;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void isSwim() {
        System.out.println(name + " is swimming");
    }
}