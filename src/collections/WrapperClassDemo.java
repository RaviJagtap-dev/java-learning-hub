package collections;

public class WrapperClassDemo {
    public static void main(String[] args) {

        // ****** Wrapper classes in java

        //Wrapper Classes== Allows primitive values (int,char,double,boolean)
        //                  to be used as an object. Wrap them in a object
        //                  generally dont wrap primitive unless you need an object
        //                  Allows use collection framework and static utility methods


            Integer a=new Integer(123);
            Double b=new Double(123);
            Character c=new Character('a');
            Boolean d=new Boolean(true);
           // Autoboxing

            Integer p=122;
            Double t=123.456;
            Character h='a';
            Boolean o=true;

            // unboxing
            int x=a;

            String r=Integer.toString(12);
            String r2=Double.toString(3.121);
            String r3=Character.toString('n');
            String r4=Boolean.toString(false);

            String f=r+r2+r3+r4;

            System.out.println(f);

            int m=Integer.parseInt(f);
            double f1=Double.parseDouble(f);
            char f2="pizza".charAt(0);
            boolean f3=Boolean.parseBoolean("true");

            char l='g';
            System.out.println(Character.isLetter(l));
            System.out.println(Character.isDigit(l));
            System.out.println(Character.isUpperCase(l));
    }
}
