package oop.superkeyword;

public class SuperDemo {
    public static void main(String[] args) {

        //******* super *****

        // super = refer to the parent class (subclass<-superclass)
        // used in constructors and method overriding
        // calls the parent constructor to initialize the attributes
//
            Person person =new Person("Sujal","Gadhave");
            Employe emp=new Employe("Ravi","Jagtap",250000);

            emp.showName();
            emp.showSalary();

            person.showName();
    }
}
