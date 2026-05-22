package oop.overriding;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void isSwim() {
        System.out.println(name + " cannot swim");
    }
}