package java_question;

import java.util.Scanner;
// How would you write a Java program that accepts a number from the user and counts the number of even and odd digits in the given number?
public class DigitCounter {

    public static void main(String[] args) {
        // Create a scanner to accept user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for a number input from the user
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int evenCount = 0, oddCount = 0;
        
        while (number != 0) {
            int digit = (int) (number % 10);  // Extract last digit
            if (digit % 2 == 0) {
                evenCount++;  // Increment even digit counter
            } else {
                oddCount++;   // Increment odd digit counter
            }
            number /= 10;  // Remove the last digit
        }

        // Output the count of even and odd digits
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);

        scanner.close(); 
    }
}
