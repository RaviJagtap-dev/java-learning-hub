package methods;

public class OverloadedMethods {
    public static void main(String[] args) {
        // Overloaded methods in java
        // overloaded methods means= it can be share the same name but different parameters

        System.out.println(add(100,250));
    }

    static double add(double a,double b) {
        return a + b;
    }

    static double add(double a,double b,double c) {
        return a + b + c;
    }
}
