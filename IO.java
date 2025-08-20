import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Calls scanner, creates variable for scanner input named scanner
        System.out.println("What's your name?");
        System.out.println("Enter your response:");
        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String userName = scanner.nextLine();
        // Print the message written by the user
        System.out.println("Got it,");
        System.out.println("Welcome, " + userName + "."); // <--- + = Concatenation
        System.out.println("...");
        System.out.println(userName + "...");
    }
}