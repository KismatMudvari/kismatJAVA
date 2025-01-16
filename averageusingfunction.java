
//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;

public class averageusingfunction {
    public static int averageusingfunction(int a, int b, int c) {
        int averageusingfunction = (a + b + c) / 3;
        return averageusingfunction;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the value of a: ");
        int a = sc.nextInt();
        System.out.print("ENter the value of b: ");
        int b = sc.nextInt();
        System.out.print("ENtrt the value of c: ");
        int c = sc.nextInt();
        System.out.println("The average of three is:" + averageusingfunction(a, b, c));
    }
}
