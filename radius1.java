import java.util.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class radius1 {

    // Function to calculate the circumference of a circle
    public static double radiusIntoCircumference(double circumference, int radius) {
        circumference = 2 * 3.14159265358979 * radius;
        return circumference;
    }

    // Function to display an image from a local file path
    public static void displayImage(String imagePath) {
        try {
            File imageFile = new File(imagePath); // Specify the image path
            BufferedImage image = ImageIO.read(imageFile); // Loads the image
        } catch (Exception e) {
            // No error message, just silently handle the error
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for radius input and calculate circumference
        System.out.print("Enter the Radius of Circle: ");
        int radius = sc.nextInt();
        System.out.print("The Circumference of the circle is: " + radiusIntoCircumference(0, radius));

        // Directly provide the image path (change this to your actual image path)
        String imagePath = "C:\\Users\\Acer\\Downloads\\VS\\image.jpg"; // <-- Set your image path here
        displayImage(imagePath);
    }
}
