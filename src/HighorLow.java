// Pseudocode:
// 1. Import the Scanner and Random classes.
// 2. Declare the class HighorLow.
// 3. In the main method:
//    a. Create a Scanner object to read from the standard input.
//    b. Create a Random object to generate random numbers.
//    c. Generate a random integer between 1 and 10.
//    d. Declare and initialize a variable to store the user's guess.
//    e. Use a do-while loop to prompt the user for a valid guess.
//       - The guess should be an integer between 1 and 10.
//    f. Compare the guess to the generated number and print if the guess was high, low, or correct.

import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random randomNumberGenerator = new Random();
        int randomNumber = randomNumberGenerator.nextInt(10) + 1;
        int userGuess = 0;
        boolean validInput;

        do {
            System.out.print("Guess the number (1-10): ");
            validInput = inputScanner.hasNextInt();
            if (validInput) {
                userGuess = inputScanner.nextInt();
                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("Invalid input, please enter an integer between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input, please enter an integer.");
                inputScanner.next();
            }
        } while (!validInput);

        System.out.println("The random number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Your guess was on the money!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("Your guess was too high.");
        }
    }
}
