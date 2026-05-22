package mini_projects;

public class TelephoneNumpad {
    public static void main(String [] args){
         //*** Telephone numpad ***

            char [][] telephone={{'7','8','9'},
                                 {'4','5','6'},
                                 {'1','2','3'},
                                 {'*','0','#'}};

            // This is also an enhanced for loop or also a nested loop
            for (char[]telephones:telephone){
                for (char a:telephones) {
                    System.out.print(a+" ");
                }
                System.out.println(" ");
            }
    }
}
