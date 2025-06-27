public class RocketCountdownWhile {
    public static void main(String[] args) {
        int countdown = 10; // Starting countdown value

        // Countdown loop
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--; // Decrement the countdown
        }

        // Print "Liftoff!" when the countdown reaches zero
        System.out.println("Liftoff!");
    }
    
}
