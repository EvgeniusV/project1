package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static String greet(){
    Scanner scan = new Scanner(System.in);
    System.out.print("May I have your name? ");
    String userName = scan.next();
    System.out.println("Hello, " + userName);
    return userName;
    }




}
