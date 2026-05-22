package threading;

public class MultiThreadDemo {
    public static void main(String[] args) {
        // ******* MultiThreading   ************

        // MultiThreading == Enables a program to run multiple threads concurrently
        //                  ( Thread = A set of instructions that run independently
        //                   Useful for backgrounds tasks or time-consuming operations



            Thread t1 = new Thread(new MyRunnableForMulti());
            Thread t2 = new Thread(new MyRunnableForMulti());

            t1.start();
            t2.start();
    }
}
