import java.util.*;

public class primecheck {
    public static int primecheck(int n) {
        if (n % 1 == 0) {
            System.out.print("Not a Prime Number");
        } else {
            System.out.print("A prime number");
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primecheck(n);
    }

}
