package mini_projects;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        //******** quiz game **********

        Scanner sc=new Scanner(System.in);

      //  Java quiz game

            //Options array[][]
            String[] questions={"Who is the PM of the INDIA ?",
                                "What is the biggest state in INDIA ?",
                                "In which state Marathi language speak ?",
                                "Who is the CM of the MAHARASHTRA ?",
                                "Which state is famous for the idli,dosa ?"};

            String[][] options={{"1.Ravi","2.Sujal","3.Gauri","4.Modi"},
                                {"1.maharashatra","2.karnataka","3.tamilnadu","4.Delhi"},
                                {"1.karnataka","2.maharashtra","3.tamilnadu","4.MP"},
                                {"1.Nilam","2.Pankaj","3.Pramod","4.Devendra"},
                                {"1.Karnataka","2.Maharashtra","3.Jammu-Kashmir","4.Delhi"}};
            //Declare Variables

            int[]answer={4,1,2,4,1};
            int score=0;
            int guess=0;
            System.out.println("******************************");
            System.out.println("** Welcome to Java Program **");
            System.out.println("******************************");

            for(int i=0;i<questions.length;i++){
                System.out.println(questions[i]);

                for(String option:options[i]){
                    System.out.println(option);
                }
                System.out.println("Enter your guess");
                guess=sc.nextInt();

                if(guess==answer[i]){
                    System.out.println("Congratulations! You guessed it!");
                    score++;
                }
                else{
                    System.out.println("Wrong guess !!!!!!");
                }
            }
            System.out.println("Your score is "+score+" out of "+questions.length);
    }
}
