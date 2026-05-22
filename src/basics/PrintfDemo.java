package basics;

public class PrintfDemo {
    public static void main(String[] args) {

        // printf() = is method is used to format output
        // %[flags][width][.presion][specifier .character]

            String name="Job";
            char firstLetter='j';
            int age=21;
            double height=6.5;
            boolean isEmployed=true;

            System.out.printf("Hello %s \n",name);
            System.out.printf("Your name is starts with %c \n",firstLetter);
            System.out.printf("Your age is %d \n",age);
            System.out.printf("Your height is %f \n",height);
            System.out.printf("Your isEmployed is %b \n",isEmployed);


            System.out.printf("%s is %d years old and his height is %f and also he is an employed? %b \n",name,age,height,isEmployed);

    }
}
