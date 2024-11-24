package java_question;

import java.util.Scanner;
// How would you write a Java program that accepts a number from the user and counts the number of even and odd digits in the given number?
public class EvenOddDigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int evenCount = 0;
        int oddCount = 0;

        // Handle negative numbers by converting to positive.
        number = Math.abs(number);

        while (number > 0) {
            long digit = number % 10; // Extract the last digit
            
            // Check if the digit is even or odd
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            
            number = number / 10; // Remove the last digit
        }

        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);

        scanner.close();
    }
}
