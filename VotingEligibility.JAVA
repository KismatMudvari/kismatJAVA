public class VotingEligibility {
    // Function to check voting eligibility
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Infinite loop using do-while
        do {
            System.out.print("Enter age (or enter -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) { // Exit condition
                System.out.println("Exiting program...");
                break;
            }

            if (isEligibleToVote(age)) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        } while (true); // Infinite loop condition
    }
}
