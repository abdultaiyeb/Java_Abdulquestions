package java_question;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;          // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit to reversed number
            number /= 10;                     // Remove the last digit from number
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome Number.");
        } else {
            System.out.println(originalNumber + " is Not a Palindrome Number.");
        }
    }
}
