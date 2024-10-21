package java_question;

//Question: How to reverse a String in java?

public class reverseString {

	public static void main(String[] args) {
		String original = "Likedln";
        String reversed = "";
        
        // Loop through the original string from the end to the beginning
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); 
            // Append each character to the reversed string
        }
        
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);

	}
// Code Link: https://www.programiz.com/online-compiler/1FWswbMaZ98mt
}
