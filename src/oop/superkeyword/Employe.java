package oop.superkeyword;

public class Employe extends Person {

    int salary;

    Employe(String name,String surname,int salary) {
        super(name,surname);
        this.salary=salary;

    }
    void  showSalary(){
        System.out.println(this.name+" is have "+salary+"salary");
    }
}
