package hexlet.code;

import java.util.Scanner;

public class Gcd {
    public static void nods(){
        String userName = Cli.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        while(countRightAnswer != 3){
            int value1 = 1 + (int)(Math.random() * 100);
            int value2 = 1 + (int)(Math.random() * 100);
            System.out.println("Question: " + value1 + " " + value2);
            int nodValue = 0;
            while (value1 != value2){
                if(value1 > value2){
                    value1 = value1 - value2;
                }else if(value1 < value2){
                    value2 = value2 - value1;
                }else{
                    break;
                }
                nodValue = value1;
            }
            int userAnswer = scan.nextInt();
            if(userAnswer == nodValue){
                System.out.println("Correct!");
                countRightAnswer++;
            }else{
                System.out.println("'" + userAnswer + "'" + "is wrong ;(. Correct answer was " + "'" + nodValue + "'" + "\n" +
                "Let's try again, " + userName);
                countRightAnswer = 0;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scan.close();
    }
}
