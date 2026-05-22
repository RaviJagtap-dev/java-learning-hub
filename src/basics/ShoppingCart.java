package basics;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
       //  Shopping Cart Program

            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("What item would you like to buy?");

                System.out.println("1. pizza");
                System.out.println("2. Burger");
                System.out.println("3. Chicken burger");
                System.out.println("4. Coffee");
                System.out.println("5. Sauce");
                System.out.println("0 .Exit");

                int choice = input.nextInt();
                if (choice == 0) {
                    System.out.println("Thanks fro visiting ");
                    break;
                }
                double price ;

               switch (choice) {
                    case 1:
                        price = 11.99;
                        System.out.println("You selected pizza");
                        break;
                   case 2:
                       price = 12.99;
                       System.out.println("You selected Burger");
                       break;

                    case 3:
                        price = 13.99;
                        System.out.println("You selected Chicken burger");
                        break;
                    case 4:
                        price = 14.99;
                        System.out.println("You selected Sauce");
                        break;
                    case 5:
                        price = 15.99;
                        System.out.println("You selected Coffee");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        continue;

               }
               System.out.println("Enter the quantity of the item you would like to buy");
               int quantity = input.nextInt();
               if (quantity < 0) {
                   System.out.println("Invalid quantity select at least one ");
                   continue;
               }
               double itemPrice = price * quantity;
                System.out.println("Your total price is " + itemPrice);
            }
         input.close();

    }
}
