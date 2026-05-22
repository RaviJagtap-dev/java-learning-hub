package oop.inheritance;

public class Animal {

    public boolean isAlive;
    public String name;

    Animal(String name){

        this.name = name;
        this.isAlive = true;
    }

    void isEat(String name){

        System.out.println(name + " is eating");
    }

    void isRun(String name){

        System.out.println(name + " is running");
    }
}