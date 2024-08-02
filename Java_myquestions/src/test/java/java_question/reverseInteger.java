package java_question;

// Question: How to Reverse an Integer in Java?

public class reverseInteger {

	public static void main(String[] args) {
		
		 int number = 12345; 
	        // Step 1: Initialize the integer to be reversed
	        int originalNumber = number; 
	        // Step 2: Store the original number for printing later
	        int reversedNumber = 0; 
	        // Step 3: Initialize a variable to hold the reversed number

	        // Step 4: Loop until the number becomes 0
	        while (number != 0) {
	            // Step 4a: Get the last digit of the number and add it to the reversed number
	            reversedNumber = reversedNumber * 10 + number % 10;
	            // Step 4b: Remove the last digit from the number
	            number = number / 10;
	        }

	        // Step 5: Print the original and reversed numbers
	        System.out.println("Original Number: " + originalNumber);
	        System.out.println("Reversed Number: " + reversedNumber);

	}

}
