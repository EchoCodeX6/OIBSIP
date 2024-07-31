import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        final int MAX_ATTEMPTS = 10;
        boolean isGuessedCorrectly = false;

        System.out.println("Guess the number between 1 and 100");

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                isGuessedCorrectly = true;
                break;
            }
        }

        if (!isGuessedCorrectly) {
            System.out.println("Sorry, you've used all attempts. The number was: " + numberToGuess);
        }

        scanner.close();
    }
}
