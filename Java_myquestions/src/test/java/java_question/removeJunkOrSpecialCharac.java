package java_question;

public class removeJunkOrSpecialCharac {

	public static void main(String[] args) {
		String original = "Th!is @str1ng h#as s*ome s%pecia@l ch@ar$!";
        
        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "");
        
        System.out.println("Original string: " + original);
        System.out.println("Cleaned string: " + cleaned);

	}

}
