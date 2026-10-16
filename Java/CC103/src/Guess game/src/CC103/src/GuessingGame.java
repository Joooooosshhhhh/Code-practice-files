package CC103.src;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static final int MIN = 1;
    static final int MAX = 100;
    static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {

        System.out.println("========================================");
        System.out.println("    WELCOME TO THE GUESSING GAME!");
        System.out.println("========================================");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        boolean playAgain;

        do {
            displayWelcome(name);

            int secretNumber = generateSecretNumber(MIN, MAX);

            int attemptsUsed = playGame(secretNumber, 1, name);

            displayStats(name, secretNumber, attemptsUsed);

            playAgain = askPlayAgain(name);

        } while (playAgain);

        System.out.println("\n========================================");
        System.out.println("Thanks for playing, " + name + "!");
        System.out.println("See you next time!");
        System.out.println("========================================");
    }

    public static void displayWelcome(String name) {

        System.out.println("\n========================================");
        System.out.println("Hello, " + name + "!\n");

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 10 attempts to guess it.");
        System.out.println("I'll give you a hint after each guess.\n");

        System.out.println("Let's begin!");
        System.out.println("========================================");
    }

    public static int generateSecretNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static int getUserGuess() {

        int guess;

        while (true) {

            System.out.print("Enter your guess (1-100): ");

            guess = scanner.nextInt();

            if (guess < MIN || guess > MAX) {
                System.out.println("Invalid! Please enter a number between 1 and 100.");
            } else {
                break;
            }
        }

        return guess;
    }

    public static void giveHint(int guess, int secretNumber) {

        if (guess < secretNumber) {
            System.out.println("Too low! Try a higher number.");
        } else if (guess > secretNumber) {
            System.out.println("Too high! Try a lower number.");
        }
    }

    public static int playGame(int secretNumber, int attempt, String name) {

        System.out.println("\n--- Attempt #" + attempt + " ---");

        int guess = getUserGuess();

        if (guess == secretNumber) {

            System.out.println("\nCongratulations " + name + "!");
            System.out.println("You guessed the number " + secretNumber + " in " + attempt + " attempts!");

            return attempt;
        }

        if (attempt >= MAX_ATTEMPTS) {

            System.out.println("\nGAME OVER!");
            System.out.println("You've used all 10 attempts.");
            System.out.println("The secret number was " + secretNumber + ".");

            return attempt;
        }

        giveHint(guess, secretNumber);

        return playGame(secretNumber, attempt + 1, name); // recursion
    }

    public static void displayStats(String name, int secretNumber, int attempts) {

        String rating;

        if (attempts == 1) {
            rating = "Perfect!";
        } else if (attempts <= 3) {
            rating = "Excellent!";
        } else if (attempts <= 6) {
            rating = "Good job!";
        } else if (attempts <= 10) {
            rating = "Nice try!";
        } else {
            rating = "Better luck next time!";
        }

        System.out.println("\n========================================");
        System.out.println("            GAME STATISTICS");
        System.out.println("========================================");
        System.out.println("Player: " + name);
        System.out.println("Secret Number: " + secretNumber);
        System.out.println("Attempts Used: " + attempts);
        System.out.println("Rating: " + rating);
        System.out.println("========================================");
    }
    public static boolean askPlayAgain(String name) {

        System.out.print("\nWould you like to play again, " + name + "? (Y/N): ");

        char choice = scanner.next().charAt(0);

        return choice == 'Y' || choice == 'y';
    }
}
