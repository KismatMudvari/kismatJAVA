import java.util.*;

public class charAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the Name of the character:");
        // output from user
        String name = sc.nextLine();
        System.out.println("The name of the character is:" + name.length());

        // CharAt
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

}