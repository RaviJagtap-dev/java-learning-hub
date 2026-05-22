package basics;

public class SubStringDemo {
    public static void main(String[] args) {


        //SUBSTRING


            String email="example123@gmail.com";
            String username=email.substring(0,email.indexOf("@"));

            System.out.println(email);
            System.out.println(username);

    }
}
