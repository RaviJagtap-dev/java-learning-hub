package arrays;

import java.util.Scanner;

public class SearchStringInArray {
    public static void main(String[] args) {
        //************  Searching for String in array ************

        Scanner sc = new Scanner(System.in);

        String[] fruits = {"banana", "orange", "apple", "pineapple", "kiwi", "grapefruit"};

        System.out.print("Enter the name of the fruit that you have to find :");
        String target = sc.next();

        boolean isFruit = false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.printf("The fruit %s is founded at index :" + i + "\n", target);
                isFruit = true;
                break;
            }


        }
        if (!isFruit) {
            System.out.println("The fruit " + target + " is not found");
        }

        sc.close();


    }
}