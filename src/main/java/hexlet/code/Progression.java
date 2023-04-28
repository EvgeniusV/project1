package hexlet.code;

import java.util.Scanner;

public class Progression {
    public static void progress() {
        String userName = Cli.greet();
        System.out.println("What number is missing in the progression?");
        Scanner scan = new Scanner(System.in);
        int countRightAnswer = 0;
        while(countRightAnswer != 3){
            String nums = generateNums();
            int randomIndex = (int)(Math.random() * 5);
            String[] numsArray = nums.split(" ");
            int hideValue = Integer.parseInt(numsArray[randomIndex]);
            numsArray[randomIndex] = "..";
            String result = String.join(" ", numsArray);
            System.out.println("Question: " + result);
            int userAnswer = scan.nextInt();
            if(userAnswer == hideValue){
                System.out.println("Correct!");
                countRightAnswer++;
            }else {
                System.out.println("'" + userAnswer + "'" + "is wrong answer ;(. Correct answer was " + "'" + hideValue + "'" + "\n" +
                        "Let's try again, " + userName);
                        countRightAnswer = 0;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scan.close();

    }

    public static String generateNums(){
        int length = (int)(5 + Math.random() * 6);
        int firstValue = (int)(1 + Math.random() * 19);
        int upProgress = (int)(1 + Math.random() * 9);
        String[] numsArray = new String[length];
        numsArray[0] = Integer.toString(firstValue);
        for(int i = 1; i < numsArray.length; i++){
            numsArray[i] = Integer.toString(Integer.parseInt(numsArray[i - 1]) + upProgress);
        }
        return String.join(" ", numsArray);
    }
}


