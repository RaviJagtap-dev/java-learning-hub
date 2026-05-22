package methods;

public class VarArgsDemo {
    public static void main(String[] args) {
        // *********** varargs in java *************

        //varargs =allow a method a varying no of arguments
     // makes method more flexible
        // java will pack the argument into an array
        // ...(ellipsis)

        System.out.println(add(1,2,3,4,5,6,7,8,9));
        System.out.println(avarage(1,2,3,4,5));
        System.out.println(avarage());
    }
    static int add(int...numbers){
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;

    }
    static double avarage(double ...numbers){
        double avarage=0;

        if(numbers==null||numbers.length==0){
            return 0;

        }
        for(double number:numbers){
            avarage+=number;
        }
        return avarage/numbers.length;

    }
}

