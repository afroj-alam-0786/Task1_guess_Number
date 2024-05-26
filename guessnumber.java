import java.util.Random;
import java.util.Scanner;
class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfAttempts = 0;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        while (guess != numberToGuess) {
            System.out.print("Take a guess: ");
            try {
                guess = Integer.parseInt(scanner.nextLine());
                numberOfAttempts++;
                if (guess < 1 || guess > 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the right number in " + numberOfAttempts + " attempts.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        scanner.close();
    }
}
