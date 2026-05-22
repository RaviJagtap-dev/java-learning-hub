package basics;

public class NestedIfElse {
    public static void main(String[] args) {
        // NESTED IF ELSE STATEMENT

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;


        if (isStudent) {
            if (isSenior) {
                System.out.println("You get senior student and senior student " +
                        "so you can get both discount 10% for the student and 10% senior");
                price *= 0.7;
            } else {
                System.out.println("You get student discount 10%");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get senior discount 10%");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }
    }
}