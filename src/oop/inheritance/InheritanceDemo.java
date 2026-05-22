package oop.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {

        //******  inheritance  ************

        // one class inherits the attributes and
        // methods from another class.
        // child <- parent

        // There are two words for the used inheritance
        //1. extends
        //2.inherits


           Dog dog = new Dog("Sheru");
           Cat cat = new Cat("Kajol");

            System.out.println(dog.isAlive);
            dog.isEat(dog.name);
            dog.isRun(dog.name);

            System.out.println(cat.isAlive);
            cat.isEat(cat.name);
            cat.isRun(cat.name);
    }
}
