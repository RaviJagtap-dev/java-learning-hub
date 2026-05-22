package methods;

public class VariableScopeDemo {
    public static void main(String[] args) {

            int a=10;
            doSomething();
        }

        static void doSomething(){

            int a=15;

            System.out.println(a);
        }

}

