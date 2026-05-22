package threading;

public class MyRunnable implements Runnable {
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);

                System.out.println("Times Up !!! ");
                System.exit(0);
            }
            catch (InterruptedException e) {
                System.out.println("Input received in time ");
                System.exit(0);
            }

        }

    }
}
