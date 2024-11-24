package java_question;
// Write a Java program to find Armstrong Number

public class ArmstrongNumber  {
    public static void main(String[] args) {
        
        int num = 153;
        int original = num;
        int digitCount = 0;
        int finalNum = 0;

        // Step 1: Count the number of digits
        int temp = num; // Use a temporary variable to avoid changing 'num'
        while (temp > 0) {
            temp = temp / 10;
            digitCount++;
        }

        // Step 2: Calculate the sum of each digit raised to the power of digitCount
        temp = num; // Reset temp to the original number for the calculation
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            finalNum += Math.pow(digit, digitCount); // Add digit^digitCount to finalNum
            temp = temp / 10; // Remove the last digit
        }

        // Step 3: Check if the original number is equal to the calculated sum
        if (original == finalNum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
