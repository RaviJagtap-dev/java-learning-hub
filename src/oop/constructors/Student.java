package oop.constructors;

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled=true;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = false;

    }

    void study(){
        System.out.println(this.name+" is studying");
    }
}
