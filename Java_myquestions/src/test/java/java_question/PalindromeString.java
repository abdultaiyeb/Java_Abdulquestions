package java_question;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter your String:");

        // Read the entire line as input to handle multiple words
        String str = sc.nextLine();
        String original_string = str.toLowerCase();

        // Reverse the string
        String reverse_String = "";
        int len = original_string.length();
        for (int i = len - 1; i >= 0; i--) {
            reverse_String = reverse_String + original_string.charAt(i);
        }

        // Check if the original string is equal to the reversed string
        if (original_string.equals(reverse_String)) {
            System.out.println(original_string + " is a Palindrome String");
        } else {
            System.out.println(original_string + " is Not a Palindrome String");
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
