package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // **** ArrayList in Java ****

        // ArrayList = A resizable array that stores objects (autoboxing)
        // Arrays are fixed in size but ArrayList size can change

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(25);
        list.add(60);
        list.add(40);
        list.add(15);

        System.out.println(list);

        list.remove(0);

        list.set(0, 54);

        System.out.println(list.toArray().length);

        Collections.sort(list);

        Collections.reverse(list);

        System.out.println(list);

        for (int lis : list) {
            System.out.println(lis);
        }

        // ******** String ArrayList ********

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the no of foods : ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter the food #" + i + " : ");

            String food = input.nextLine();

            foods.add(food);
        }

        System.out.println(foods);
    }
}