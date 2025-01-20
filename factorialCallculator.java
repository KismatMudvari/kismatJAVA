public class factorialCallculator {

    // Function to calculate factorial of a number
    public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Example number
        System.out.println("The factorial of " + number + " is: " + calculateFactorial(number));
    }
}
