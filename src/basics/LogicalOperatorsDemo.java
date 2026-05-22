package basics;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
//Logical Operators

        // && = AND
        // || =OR
        // ! = NOT

            double temp=20;
            boolean isSunny=false;

            if(temp <= 30 && temp >= 0 && isSunny){

                System.out.println("The Weather is good ");
                System.out.println("it is Sunny outside");
            }
            else if(temp <= 30 && temp >= 0 && !isSunny){
                System.out.println("The Weather is good ");
                System.out.println("it is not Sunny outside");
            }

    }
}
