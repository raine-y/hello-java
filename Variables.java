import java.util.Scanner; 

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // types of variables below ->
        String text = "contains text";
        int wholeNumber = 123;
        double floatingPoint = 3.141592653;
        boolean trueOrFalse = true;

        // variable type is immutable 

        System.out.println("Text variable: " + text);
        System.out.println("Integer variable: " + wholeNumber);
        System.out.println("Floating-point variable: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);
        System.out.println("Please, Write an Integer:");

        int value = Integer.valueOf(scanner.nextLine());

        System.out.println("You said: " + value);

        System.out.println("Please, Write an Decimal:");

        double dValue = Double.valueOf(scanner.nextLine());
        
        System.out.println("You said: " + dValue);

        System.out.println("Please, Write a Boolean:");
        
        boolean bValue = Boolean.valueOf(scanner.nextLine());

        System.out.println("You said: " + bValue);

    }
}