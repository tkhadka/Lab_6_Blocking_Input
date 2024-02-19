// Pseudocode:
// 1. Import the Scanner class.
// 2. Declare the class RectangleInfo.
// 3. In the main method:
//    a. Create a Scanner object to read from the standard input.
//    b. Declare and initialize variables to store the width and height of the rectangle.
//    c. Use a do-while loop to prompt the user for a valid width.
//    d. Use a do-while loop to prompt the user for a valid height.
//    e. Calculate the area, perimeter, and the length of the diagonal.
//    f. Print the area, perimeter, and the length of the diagonal.

import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double rectangleWidth = 0.0;
        double rectangleHeight = 0.0;
        boolean validInput;

        do {
            System.out.print("Enter the width of the rectangle: ");
            validInput = inputScanner.hasNextDouble();
            if (validInput) {
                rectangleWidth = inputScanner.nextDouble();
            } else {
                System.out.println("Invalid input, please enter a valid number for the width.");
                inputScanner.next();
            }
        } while (!validInput);

        do {
            System.out.print("Enter the height of the rectangle: ");
            validInput = inputScanner.hasNextDouble();
            if (validInput) {
                rectangleHeight = inputScanner.nextDouble();
            } else {
                System.out.println("Invalid input, please enter a valid number for the height.");
                inputScanner.next();
            }
        } while (!validInput);

        double area = rectangleWidth * rectangleHeight;
        double perimeter = 2 * (rectangleWidth + rectangleHeight);
        double diagonal = Math.sqrt(rectangleWidth * rectangleWidth + rectangleHeight * rectangleHeight);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal of the rectangle: " + diagonal);

    }
}
