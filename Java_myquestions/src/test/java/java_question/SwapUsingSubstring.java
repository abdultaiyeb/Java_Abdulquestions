package java_question;
//Write a program to swap the two numbers using the substring method.
public class SwapUsingSubstring {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        System.out.println("Before swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        // Concatenate num1 and num2
        String temp = num1 + num2; // temp is now "123456"

        // Swap using the substring method
        num1 = temp.substring(num1.length()); // Extract "456"
        num2 = temp.substring(0, num1.length()); // Extract "123"

        System.out.println("After swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}
