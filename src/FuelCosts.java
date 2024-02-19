// Pseudocode:
// 1. Import the Scanner class.
// 2. Declare the class FuelCosts.
// 3. In the main method:
//    a. Create a Scanner object to read from the standard input.
//    b. Declare and initialize variables to store the number of gallons of gas in the tank,
//       the fuel efficiency, and the price of gas per gallon.
//    c. Use a do-while loop to prompt the user for a valid number of gallons.
//    d. Use a do-while loop to prompt the user for a valid fuel efficiency.
//    e. Use a do-while loop to prompt the user for a valid price of gas.
//    f. Calculate the cost per 100 miles and the distance the car can travel.
//    g. Print the calculated cost per 100 miles and the travel distance.

import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double tankGallons = 0.0;
        double milesPerGallon = 0.0;
        double gasPricePerGallon = 0.0;
        boolean validInput;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            validInput = inputScanner.hasNextDouble();
            if (validInput) {
                tankGallons = inputScanner.nextDouble();
            } else {
                System.out.println("Invalid input, please enter a valid number for gallons.");
                inputScanner.next();
            }
        } while (!validInput);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            validInput = inputScanner.hasNextDouble();
            if (validInput) {
                milesPerGallon = inputScanner.nextDouble();
            } else {
                System.out.println("Invalid input, please enter a valid number for miles per gallon.");
                inputScanner.next();
            }
        } while (!validInput);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            validInput = inputScanner.hasNextDouble();
            if (validInput) {
                gasPricePerGallon = inputScanner.nextDouble();
            } else {
                System.out.println("Invalid input, please enter a valid number for the price of gas.");
                inputScanner.next();
            }
        } while (!validInput);

        double costPerHundredMiles = (100 / milesPerGallon) * gasPricePerGallon;
        double maxDistance = tankGallons * milesPerGallon;

        System.out.println("Cost per 100 miles: " + costPerHundredMiles);
        System.out.println("The car can go with the gas in the tank: " + maxDistance + " miles");

    }
}
