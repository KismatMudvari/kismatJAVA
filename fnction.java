public class fnction {
    public static void main(String[] args) {
        System.out.println(add(3, 4)); // Call add function and print result
        greet(); // Call greet function
    }

    static void greet() {
        System.out.println("Hello!");
    } // Function to print Hello

    static int add(int a, int b) {
        return a + b;
    } // Function to add two numbers
}
