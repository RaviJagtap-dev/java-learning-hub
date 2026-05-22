package basics;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {

        // calculater Program using java

            Scanner sc = new Scanner(System.in);


            double num1;
            double num2;
            char operator;
            double result=0;
            boolean validOperator=true;

            System.out.print("Enter The first number");
            num1 = sc.nextInt();
            System.out.println("Enter The operator(+ , -, *, /)");
            operator = sc.next().charAt(0);
            System.out.print("Enter The second number");
            num2 = sc.nextDouble();

            switch (operator) {
                case '+'-> result = num1 + num2;
                case '-'-> result = num1 - num2;
                case '*'-> result = num1 * num2;
                case '/'-> {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                        validOperator=false;
                    }else  {
                        result = num1 / num2;
                    }
                }
                default -> {
                    System.out.println("Invalid operator");
                    validOperator = false;

                }

            }

            if (validOperator) {
                System.out.println("The result is: " + result);
            }

        sc.close();
    }
}
