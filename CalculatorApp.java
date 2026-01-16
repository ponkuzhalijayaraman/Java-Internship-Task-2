import java.util.Scanner;

public class CalculatorApp {

    // static variable (class-level)
    static String appName = "Console Calculator";

    // instance variable (object-level)
    int instanceValue = 10;

    public static void main(String[] args) {

        // local variables (method-level)
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.75;
        char c = 'A';
        boolean flag = true;

        // Explaining memory usage via comments:
        // byte -> 1 byte, short -> 2 bytes, int -> 4 bytes
        // long -> 8 bytes, float -> 4 bytes, double -> 8 bytes
        // char -> 2 bytes, boolean -> JVM dependent

        System.out.println("Welcome to " + appName);

        Scanner sc = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Arithmetic operations
            int sum = num1 + num2;
            int diff = num1 - num2;
            int product = num1 * num2;
            double division = (double) num1 / num2; // type casting

            // Formatted output
            System.out.printf("Sum: %d%n", sum);
            System.out.printf("Difference: %d%n", diff);
            System.out.printf("Product: %d%n", product);
            System.out.printf("Division: %.2f%n", division);

            // Demonstrating incompatible type casting
            double bigValue = 99.99;
            int smallValue = (int) bigValue; // explicit casting
            System.out.println("After casting double to int: " + smallValue);

        } catch (Exception e) {
            // Handling invalid input
            System.out.println("Invalid input! Please enter numbers only.");
        }

        sc.close();
    }
}
