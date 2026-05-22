package oop.staticdemo;

public class Friend {

    static int noOFFriends;
    String name;

    Friend(String name){
        this.name = name;
        noOFFriends++;
    }

    static void showFriends(){
        System.out.println("you have "+Friend.noOFFriends+" friends");
    }
}
