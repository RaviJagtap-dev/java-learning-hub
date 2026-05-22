package oop.constructors;

public class User {

    String name;
    String password;
    String email;
    int age;

    User(){
        this.name=null;
        this.password=null;
        this.email=null;
        this.age=0;
    }

    User(String name){
        this.name=name;
        this.password="Not Provided";
        this.email=null;
    }
    User (String name,String password){
        this.name=name;
        this.password=password;
        this.email=null;
        this.age=0;
    }
    User (String name,String password,String email){
        this.name=name;
        this.password=password;
        this.email=email;
        this.age=0;

    }
}
