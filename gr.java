public class gr {

    // Function to calculate GCD using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // EnsFacure the GCD is always positive
    }

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;

        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }
}
