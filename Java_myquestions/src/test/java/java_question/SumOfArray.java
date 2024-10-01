package java_question;
// Find Sum of Elements in Array
public class SumOfArray {

    public static void main(String[] args) {
        int a[] = {4, 6, 3, 8, 1, 1};
        int sum = 0;

        // Using a for loop to calculate the sum of elements
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum using for loop: " + sum);

        // Resetting sum to 0 for the next calculation
        sum = 0;

        // Using an enhanced for loop to calculate the sum of elements
        for (int value : a) {
            sum = sum + value;
        }
        System.out.println("Sum using enhanced for loop: " + sum);
    }
}
