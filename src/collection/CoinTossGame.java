package collection;
import java.util.Random;
import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Coin Toss Game!");
        System.out.println("Guess the outcome of the coin toss (heads or tails).");

        String[] outcomes = { "heads", "tails" };
        int randomIndex = random.nextInt(2);
        String actualOutcome = outcomes[randomIndex];

        System.out.print("Enter your guess (heads or tails): ");
        String userGuess = scanner.nextLine().toLowerCase();

        if (userGuess.equals("heads") || userGuess.equals("tails")) {
            System.out.println("Coin is tossed...");

            if (userGuess.equals(actualOutcome)) {
                System.out.println("Congratulations! You guessed correctly. It's " + actualOutcome + "!");
            } else {
                System.out.println("Sorry! You guessed wrong. It's " + actualOutcome + "!");
            }
        } else {
            System.out.println("Invalid input! Please enter either 'heads' or 'tails'.");
        }
    }
}
