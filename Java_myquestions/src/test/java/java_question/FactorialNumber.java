package java_question;

// Write a code to find a Factorial of a Number.

public class FactorialNumber {

    public static void main(String[] args) {
        
        int number = 5;  
        long factorial = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        // Print the result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
