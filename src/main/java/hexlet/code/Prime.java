package hexlet.code;

import java.util.Scanner;

public class Prime {

    public static void primeNums(){
        String userName = Cli.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        while(countRightAnswer != 3){
            boolean isPrime = true;
            int value = (int)(1 + Math.random() * 99);
            if(value < 2){
                isPrime = false;
            }
            for(int i = 2; i < value / 2; i++){
                if(value % i == 0){
                    isPrime = false;
                }
            }
            System.out.println("Question: " + value);
            String userAnswer = scan.next();
            if(isPrime == true && userAnswer.equals("yes")){
                System.out.println("Correct!");
                countRightAnswer++;
            }else if(isPrime == true && userAnswer.equals("no")){
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes' \n" +
                        "Let's try again, " + userName);
                countRightAnswer = 0;

            }else if(isPrime == false && userAnswer.equals("no")){
                System.out.println("Correct!");
                countRightAnswer++;
            }else if(isPrime == false && userAnswer.equals("yes")){
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no' \n" +
                        "Let's try again, " + userName);
                countRightAnswer = 0;
            }else {
                break;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scan.close();
    }
}
