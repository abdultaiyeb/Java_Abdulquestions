package java_question;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the three integers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        // Find the largest using the ternary operator
        int largest = (a > b ? a : b) > c ? (a > b ? a : b) : c;

        // Display the largest number
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        scanner.close();
    }

}

