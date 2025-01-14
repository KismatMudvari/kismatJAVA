import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        try (Scanner scanner = new Scanner(System.in)) {
            int attempts = 0;

            System.out.println("Guess a number between 1 and 100:");

            while (true) {
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again:");
                } else {
                    System.out.println("Too high! Try again:");
                }
            }
        }
    }
}
