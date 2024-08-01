package java_question;

//Question: How can you remove junk or special characters from a string in Java?

public class removeJunkOrSpecialCharac {

	public static void main(String[] args) {
		String original = "Th!is @str1ng h#as s*ome s%pecia@l ch@ar$!";
        
        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "");
        
        System.out.println("Original string: " + original);
        System.out.println("Cleaned string: " + cleaned);

	}
//Code Link: https://www.programiz.com/online-compiler/2I9hBkQCNbZGi
}
