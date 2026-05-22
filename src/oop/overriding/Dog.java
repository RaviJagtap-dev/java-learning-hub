package oop.overriding;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void isSwim() {
        System.out.println(name + " can swim");
    }
}