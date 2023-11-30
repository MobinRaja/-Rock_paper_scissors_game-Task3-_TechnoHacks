package calci;

import java.util.Random;
import java.util.Scanner;

public class R_P_S {
    public static void main(String[] args) {
        // Array to represent the choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Random number generator for computer's choice
        Random random = new Random();

        while (true) {
            // Display menu for user choice
            System.out.println("Choose your move:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");

            // Get user choice
            int userChoice = scanner.nextInt();

            // Check if the user wants to quit
            if (userChoice == 4) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            // Validate user input
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please choose a number between 1 and 3.");
                continue;
            }

            // Convert user choice to array index
            int userIndex = userChoice - 1;
            String userMove = choices[userIndex];

            // Generate computer's choice
            int computerIndex = random.nextInt(3);
            String computerMove = choices[computerIndex];

            // Display choices
            System.out.println("Your move: " + userMove);
            System.out.println("Computer's move: " + computerMove);

            // Determine the winner
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("Rock") && computerMove.equals("Scissors")) ||
                       (userMove.equals("Paper") && computerMove.equals("Rock")) ||
                       (userMove.equals("Scissors") && computerMove.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println(); // Add a newline for better readability
        }

        // Close the scanner
        scanner.close();
    }
}
