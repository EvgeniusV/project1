package hexlet.code;
import java.util.Scanner;
public class Even {

    public static void evenNumber(){
        String userName = Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answers 'no'.\n");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        while(countRightAnswer != 3){
            int randomValue = (int)(1 + Math.random() * 100);
            boolean evenTest = randomValue % 2 == 0 ? true : false;
            System.out.println("Question: " + randomValue);
            String userAnswer = scan.next();
            System.out.println("Your answer " + userAnswer);

            switch (userAnswer){
                case "yes":
                    if(userAnswer.equals("yes") && evenTest == true){
                        System.out.println("Correct!");
                        countRightAnswer++;
                    }else{
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                                "Let's try again, " + userName);
                        countRightAnswer = 0;
                    }
                    break;
                case "no":
                    if(userAnswer.equals("no") && evenTest == false){
                        System.out.println("Correct!");
                        countRightAnswer++;
                    }else{
                        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                                "Let's try again, " + userName);
                        countRightAnswer = 0;
                    }
                    break;
                default:
                    String correctAnswer = evenTest == true ? "yes" : "no";
                    System.out.println("'"+ userAnswer + "'" + "is wrong answer ;(. Correct answer was." + "'" + correctAnswer + "'" + "\n"
                    + "Let's try again, " + userName);
                    countRightAnswer = 0;
                    break;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scan.close();
    }
}
