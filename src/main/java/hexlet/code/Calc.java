package hexlet.code;
import java.util.Scanner;

public class Calc {

    public static void operation() {
        String userName = Cli.greet();
        System.out.println("What is the result of the expression");
        int countRightAnswer = 0;
        Scanner scan = new Scanner(System.in);
        while (countRightAnswer != 3) {
            int value1 = (int) (1 + Math.random() * 100);
            int value2 = (int) (1 + Math.random() * 100);
            int randomIndex = (int) (Math.random() * 3);
            String symbols = "+-*";
            long result = 0;
            switch (symbols.charAt(randomIndex)){
                case '+':
                    System.out.println("Question: " + value1 + " " + '+' + " " + value2);
                    result = value1 + value2;
                    break;
                case '-':
                    System.out.println("Question: " + value1 + " " + '-' + " " + value2);
                    result = value1 - value2;
                    break;
                case '*':
                    System.out.println("Question: " + value1 + " " + '*' + " " + value2);
                    result = value1 * value2;
                    break;
            }
            int userAnswer = scan.nextInt();
            if(userAnswer == result){
                System.out.println("Correct!");
                countRightAnswer++;
            }else {
                System.out.println("'" + userAnswer + "'" + "is wrong ;(. Correct answer was " + "'" + result + "'" + "\n"
                + "Let's try again, " + userName);
                countRightAnswer = 0;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scan.close();
    }
}

