public class GreaterNumber {
    // Function to return the greater of two numbers
    public static int getGreater(int num1, int num2) {
        // Use a ternary operator for simplicity
        return (num1 > num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(getGreater(10, 20)); // Output: 20
        System.out.println(getGreater(30, 15)); // Output: 30
    }
}
