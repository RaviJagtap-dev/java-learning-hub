package oop.constructors;

import oop.objectdemo.Car;

public class ConstructorDemo {
    public static void main(String[] args) {
        // *** Constructors in java ****

        // Constructors is a spacial method to initialize objects
         //you can pass the arguments to the constructors
         //and set up initial values

         Student student1=new Student("Ravi",20,2.5);
            Student student2=new Student("Sujal",21,5.6);

            System.out.println(student1.name);
            System.out.println(student1.age);
            System.out.println(student1.gpa);
            System.out.println(student1.isEnrolled);
            student1.study();
            System.out.println(" ");
            System.out.println(student2.name);
            System.out.println(student2.age);
            System.out.println(student2.gpa);
            System.out.println(student2.isEnrolled);
            student2.study();

        // Overloaded Constructors

        // it allo a class to have multiple constructors
        // with different arguments
        // Enable objects to be initialize in various way

    User user=new User();

    User user1=new User("Gauri","Gauri@313");

            System.out.println(user.name);
            System.out.println(user.password);
            System.out.println(user.email);
            System.out.println(user.age);

            System.out.println(user1.name);
            System.out.println(user1.password);
            System.out.println(user1.email);
            System.out.println(user1.age);

         Car car1 =new Car("Maruti8000","Red","Suzuki");
         Car car2 =new Car("Verna","White","Tata");
         Car car3 =new Car("Scorpio","Black","Mahendra");

           Car[] cars={car1,car2,car3};

            for (Car car : cars) {
                car.drive();
            }
    }
}
