package java_question;

import java.util.Arrays;
// find the second largest element in a given list
public class FindSecondLargestNumber {

    public static void main(String[] args) {
        
        int[] arr = {3, 54, 23, 78, 32};  // Example array
        
        int size = arr.length;

        // Check if the array has less than 2 elements
        if (size < 2) {
            System.out.println("Invalid input: Array must contain at least two elements.");
            return;  // Exit if invalid input
        }

        // Sort the array
        Arrays.sort(arr);
        
        // Find the second largest number
        int secondLargest = arr[size - 2];  // Get the second largest number

        // Print the result
        System.out.println("The second largest number is: " + secondLargest);
        
    }
}
