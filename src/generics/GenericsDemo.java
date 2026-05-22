package generics;

public class GenericsDemo {
    public static void main(String[] args) {

        //** Generics in java *********

        // Generics == A concept where you can write a class ,Interfaces ,or method
        //             that is compatible with different data types .
        //             <T> Type parameter (placeholder that replace with the real type
        //             <String> type argument (specifies the type)

            generics.Box<String ,Integer> box=new generics.Box<>("Pen",20);
            System.out.println(box.getItem());
            System.out.println(box.getPrice());
    }
}
