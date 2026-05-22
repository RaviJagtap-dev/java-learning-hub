package arrays;

import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args) {
      //  ********* SEARCH IN ARRAY **************
      //   this is for searching for the numbers
        Scanner sc=new Scanner(System.in);

            int [] numbers ={1,2,9,7,5,3,6};
            System.out.print("Enter your target number ::");
            int target=sc.nextInt();

            boolean isFound = false;

            for (int i=0;i<numbers.length;i++){
                if(target==numbers[i]){
                    System.out.printf("Element %d found at index "+i+".",target);
                    isFound=true;
                    break;
                }
            }
            if(!isFound){
                System.out.printf("Element %d not found.",target);

            }
    }
}
