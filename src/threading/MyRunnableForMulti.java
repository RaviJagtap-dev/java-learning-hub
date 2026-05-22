package threading;

public class MyRunnableForMulti implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }
            catch (InterruptedException e) {
                System.out.println(e);
                System.out.println("Interrupted");

            }
        }
    }
}
