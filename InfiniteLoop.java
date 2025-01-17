public class InfiniteLoop {
    public static void main(String[] args) {
        int counter = 1; // Example counter for demonstration

        do {
            System.out.println("This is iteration number: " + counter);
            counter++; // Increment the counter (optional, for demonstration)
        } while (true); // Infinite condition
    }
}
