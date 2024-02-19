// Pseudocode:
// 1. Import the Scanner class.
// 2. Declare the class MetricConverter.
// 3. In the main method:
//    a. Create a Scanner object to read from the standard input.
//    b. Declare and initialize a variable to store the measurement in meters.
//    c. Use a do-while loop to prompt the user for a valid measurement in meters.
//    d. Convert the measurement to miles, feet, and inches using conversion factors.
//    e. Print the measurements in miles, feet, and inches.

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double metersInput = 0.0;
        boolean validInput;

        do {
            System.out.print("Enter the measurement in meters: ");
            validInput = inputScanner.hasNextDouble();
            if (validInput) {
                metersInput = inputScanner.nextDouble();
            } else {
                System.out.println("Invalid input, please enter a valid number for meters.");
                inputScanner.next();
            }
        } while (!validInput);

        // Conversion factors
        final double METERS_TO_MILES = 0.000621371;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.3701;

        // Conversions
        double miles = metersInput * METERS_TO_MILES;
        double feet = metersInput * METERS_TO_FEET;
        double inches = metersInput * METERS_TO_INCHES;

        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);

    }
}
