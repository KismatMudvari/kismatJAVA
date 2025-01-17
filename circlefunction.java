public class circlefunction {
    // Function to calculate and return the circumference of a circle
    public static double getCircumference(double radius) {
        // Use the formula: Circumference = 2 * π * radius
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Example usage
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        // Call the function and display the result
        double circumference = getCircumference(radius);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
