import java.util.*;

public class Revise {
    public static void main(String[] args) {
        int a = 4, b = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("");
        }
    }
}
