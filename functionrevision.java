import java.util.*;

public class functionrevision {
    public static int calculateMultiple(int a, int b) {
        int multiple = a * b;
        return multiple;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("enter the value of b: ");
        int b = sc.nextInt();
        int multiple = calculateMultiple(a, b);
        System.out.println("the multiple of a nd b is: " + multiple);
    }
}
