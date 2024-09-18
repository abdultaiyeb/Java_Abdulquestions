package java_question;

public class countSumOfDigits {
    public static void main(String[] args) {
        int num = 1234567; // Example input number
        int sum = 0; // Variable to store the sum of digits

        // Loop to process each digit
        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit from num
        }

        // Output the result
        System.out.println("Sum of digits in the number: " + sum);
    }
}

