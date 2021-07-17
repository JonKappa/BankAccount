import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountInfo JPM = new AccountInfo("FredTester", "1a2345");
        System.out.print("Username: ");
        String inUser = input.nextLine();
        System.out.print("Password: ");
        String inPass = input.nextLine();
        boolean usernameCheck = inUser.equalsIgnoreCase(JPM.userName);
        boolean passwordCheck = inPass.equals(JPM.userPass);
        int failtrys = 0;


        while (!usernameCheck || !passwordCheck) {
            failtrys++;
            if (failtrys == 5) {
                System.out.println("You have used too many attempts and have been locked out, please contact Customer Support at 1-800-555-5555 for assistance.");
                System.exit(0);
            }
            System.out.println("Username or password is incorrect, please try again.");
            System.out.print("Username: ");
            inUser = input.nextLine();
            System.out.print("Password: ");
            inPass = input.nextLine();
            usernameCheck = inUser.equalsIgnoreCase(JPM.userName);
            passwordCheck = inPass.equals(JPM.userPass);


        }
        System.out.println("Logging in... ");
        System.out.println("Hello Fred Tester!");



    }
}