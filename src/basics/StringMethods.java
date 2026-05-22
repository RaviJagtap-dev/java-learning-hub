package basics;

public class StringMethods {
    public static void main(String[] args) {

        // STRING METHODS

            String name = "Ravi Jagtap";
            int length=name.length();
            char ch = name.charAt(0);
            int index=name.indexOf("J");
            int lastIndex=name.lastIndexOf("r");

            name=name.toUpperCase();


            System.out.println(name);
    }
}
