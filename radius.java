
//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;

public class radius {
    public static double radiusIntoCircumference(double circumference, int radius) {
        circumference = 2 * 3.14159265358979 * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle: ");
        int radius = sc.nextInt();
        System.out.print("The Circumference of the circle is:" + radiusIntoCircumference(radius, radius));
    }
}
