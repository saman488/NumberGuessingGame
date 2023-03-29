import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        boolean playerGuessedCorrectly = false;

        while (!playerGuessedCorrectly) {
        System.out.print("Enter your guess (1-100): ");
        int playGuess = scanner.nextInt();

            if (playGuess == randomNumber) {
                System.out.println("Correct you Win!");
                playerGuessedCorrectly = true;

            } else if (randomNumber > playGuess) {
                System.out.println("Nope! The number is higher.");

            } else
                System.out.print("Nope! The number is lower.");

        }
    }
}