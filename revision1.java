import java.util.*;

public class revision1 {
    public static int Smallernum(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        System.out.println("The Smaller between A and B is:" + Smallernum(a, b));
    }
}