package java_question;

// Count Number Of Digits in A Number
public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num = 123456; // Example input
        int count = 0;

        // Handle negative numbers
        num = Math.abs(num);

        // Special case for number 0
        if (num == 0) {
            count = 1;
        } else {
            // Loop until the number becomes 0
            while (num > 0) {
                num = num / 10; // Remove the last digit
                count++;
            }
        }

        System.out.println("Number of Digits: " + count);
    }

	}


