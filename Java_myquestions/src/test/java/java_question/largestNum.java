package java_question;
//Given two integers, how would you find the largest number without using an if condition in Java? 
public class largestNum {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Find the largest number using the ternary operator
        int largest = (a > b ? a : b);
        System.out.println(largest);
    }
}





