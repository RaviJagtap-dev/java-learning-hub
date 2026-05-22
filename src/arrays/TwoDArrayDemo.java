package arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {
      //  ************* 2D Array in JAVA ***************

        // 2D array = An array where each element is an array
                   //   useful for the storing matrix of data

            String[][] groceries={{"apple","banana","pineapple"},
                                    {"patato","onion","tomato"},
                                    {"cherry","cherry","cherry" }};
            groceries[0][0]="coconut";

            for(String[] foods:groceries){
                for(String food:foods){
                    System.out.print(food+" ");
                }
                System.out.println();

            }
    }
}
