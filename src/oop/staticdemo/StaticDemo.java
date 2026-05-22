package oop.staticdemo;

public class StaticDemo {
    public static void main(String[] args) {

        // ***** static *******

        // static =it make a variable or method belong to the class
        // rather than to any specific object
        // commonly used for the utility methods or shared resources

            Friend friend1=new Friend("Sujal");
            Friend friend2=new Friend("Pramod");
            Friend friend3=new Friend("Pankaj");
            Friend friend4=new Friend("Shreeyesh");

           Friend.showFriends();
    }
}
