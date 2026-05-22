package oop.superkeyword;

public class Person {

    String  name;
    String  surname;

    Person(String name,String surname){
        this.name=name;
        this.surname=surname;

    }
    void showName(){
        System.out.println(this.name+" "+this.surname);
    }
}
