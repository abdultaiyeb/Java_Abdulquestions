package java_question;

import java.util.ArrayList;
import java.util.List;
// Write a Java program that takes an array of integers and separates the even and odd numbers into two different lists.
public class EvenOddFromArray {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Lists to store even and odd numbers
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // Loop through the array and separate even and odd numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        // Print even numbers
        System.out.println("Even Numbers: " + evenNumbers);

        // Print odd numbers
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}

