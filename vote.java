
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;

public class vote {
    public static String eligibleOrnor(int age, String eligible, String not_eligible) {

        if (age >= 18) {
            return eligible;
        } else {
            return not_eligible;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("User is " + eligibleOrnor(age, "eligible", "not_eligible") + " for Vote");

    }

}
