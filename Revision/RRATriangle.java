package Revision;

public class RRATriangle {
    // Reverse right angle triangle//
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
