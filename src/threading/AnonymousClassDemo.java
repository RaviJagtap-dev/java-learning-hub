package threading;

public class AnonymousClassDemo {

    public static void main(String[] args) {

        // ****** Anonymous Class in Java ******

        // Anonymous Class = class without a name
        // Used for one-time implementation

        Dog dog = new Dog();

        Dog dog2 = new Dog() {

            @Override
            public void speak() {
                System.out.println("Scooby dog goes ruh ruh ruh");
            }
        };

        dog.speak();

        dog2.speak();
    }
}

class Dog {

    public void speak() {
        System.out.println("Dog goes woof woof");
    }
}