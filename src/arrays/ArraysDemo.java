package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
      //   ******************* Array ***************

         //array = a collection of values of same data type
            //    think of it is a variable that can be store more than one values

        Scanner sc=new Scanner(System.in);

         String[]fruits={"apple","Banana","orange","coconut"};


          Arrays.sort(fruits);
          Arrays.fill(fruits,"pineapple");

       //  Enhanced For loop
            for(String fruit:fruits){
                System.out.println(fruit);
            }
            for(int i=0;i<fruits.length;i++){
                System.out.print(fruits[i]+" ");
            }

       //  Enter user input into an  array

         //here we are create the array
            String [] foods;
            int size;
        //here we can give the size of array from the users
            System.out.println("Enter the size of the array you want :");
            size=sc.nextInt();

        // this line will execute for the continue the program for next line
         sc.nextLine();
        // here we declare the size of the array
        foods=new String[size];

         //loop for the give the inputs from the users and added into the array
            for(int i=0;i< foods.length;i++){
                System.out.println("Enter the food you want to add:");
                foods[i]=sc.nextLine();
            }
         //for printing the array
            for(String food:foods){
                System.out.println(food);
            }
    }
}
