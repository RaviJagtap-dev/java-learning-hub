package basics;

public class BreakContinueDemo {
    public static void main(String[] args) {

        // Break And Continue in java

        // break=break out of aloop (STOP)
        //continue=Skip the current iteration of aloop(SKIP)

            for (int i=0;i<10;i++){

                if (i==5){
                    break;
                }
                System.out.print(i +" ");
            }
            for (int i=0;i<10;i++){

                if (i==5){
                    continue;
                }
                System.out.println(i +" ");
            }
    }
}
