package basics;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        //ternary operator

        // ternary operator ?= return 1 of 2 values if condition is true
        // variable =(condition )? ifTrue : ifFalse

            int score =70;

            String passOrFail =(score>=80)? "Pass" : "Fail";
            System.out.println(passOrFail);
    }
}
