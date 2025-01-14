import java.util.Scanner;

public class Calsulator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Enter an operation (+, -, *, /):");
            char operation = scanner.next().charAt(0);

            double result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num2 != 0 ? num1 / num2 : Double.NaN;
                    break;
                default:
                    System.out.println("Invalid operation!");
                    return;
            }
            System.out.println("Result: " + result);
        }
    }
}
