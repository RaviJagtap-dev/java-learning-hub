package methods;

public class MethodDemo {
    public static void main(String[] args) throws InterruptedException {
        // method in java

            int age = 21;
            if (ageCheck(age)) {
                System.out.println("You may sign up  ");
            } else {
                System.out.println("You may not sign up");
            }
        }

        static void happyBirthdayGauri(String name, int age) throws InterruptedException {

            System.out.printf("Happy Birthday %s enjoy your birth day \n", name);
            System.out.printf("Now Your %d years old  ", age);

            System.out.println("Happy Birthday Gauri");
            System.out.println("Happy Birthday Gauri");
            System.out.println("Happy Birthday Gauri");
        }

        static boolean ageCheck(int age) throws InterruptedException {
            if (age >= 18) {
                return true;

            } else {
                return false;
            }
    }
}
