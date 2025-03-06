import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NAME:");
        String name = sc.next();// for single word
        sc.nextLine();

        System.out.print("ENTER FULL NAME:");
        String Full_Name = sc.nextLine();// for whole line

        // outpu
        System.out.println("The name is:" + name);
        System.out.print("The name is:" + Full_Name);
    }
}
