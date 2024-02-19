// Pseudocode:
// 1. Initialize a Scanner instance for user input
// 2. Declare variable to hold the Celsius value
// 3. Use a do-while loop to:
//    a. Prompt the user for the Celsius value
//    b. Check if the entered value is a valid double
//    c. If valid, calculate the Fahrenheit value
//    d. If not valid, prompt the user again
// 4. Output the Fahrenheit value

import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double celsiusValue;
        double fahrenheitValue;
        boolean validInput;

        do {
            System.out.print("Enter temperature in Celsius: ");
            validInput = inputScanner.hasNextDouble();

            if (validInput) {
                celsiusValue = inputScanner.nextDouble();
                fahrenheitValue = (celsiusValue * 9/5) + 32;
                System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheitValue);
            } else {
                System.out.println("Invalid input, please enter a valid number.");
                inputScanner.next();
            }
        } while (!validInput);
    }
}
