package hexlet.code;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter \n");
        System.out.println("1 - Greet\n2 - Even");
        int userChoiceValue = userChoice();
        System.out.println("Your choice: " + userChoiceValue);
        switch (userChoiceValue){
            case 1:
                System.out.println("Welcome the Brains Game!");
                Cli.greet();
                break;
            case 2:
                Even.evenNumber();
                break;
            case 0:
                break;

        }
    }

    public static int userChoice(){
        Scanner scan = new Scanner(System.in);
        int userChoice = scan.nextInt();
        return userChoice;
    }
}
