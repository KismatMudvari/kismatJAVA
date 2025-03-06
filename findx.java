import java.util.*;

public class findx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] number = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        System.out.println("Enter x:");

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (number[i][j] == x) {
                    System.out.println("x found at (" + i + "," + j + ")");

                }
            }

        }
    }

}
