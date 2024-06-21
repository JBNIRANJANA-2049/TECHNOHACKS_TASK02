import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess what number I have chosen between 1 to 100?");

        while (!hasGuessedCorrectly) {
            System.out.print(" Please Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Your guess is too high. Try again!");
            } else {
                System.out.println("Well done! You guessed the correct number: " + numberToGuess);
                hasGuessedCorrectly = true;
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game. Goodbye!");

        scanner.close();
    }
}
