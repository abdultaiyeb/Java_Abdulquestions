package java_question;
// Write a Java progra to count the frequency of each character in a given string and prints the results. 
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        
        String s = "interview";
        countOccurrence(s);
    }
    
    public static void countOccurrence(String s) {
        
        Map<Character, Integer> name = new HashMap<>();
        char[] charArr = s.toCharArray();  // Convert the string to a character array
        
        for (char c : charArr) {
            // Check if the character is already in the map, if so, increment the count
            if (name.containsKey(c)) {
                name.put(c, name.get(c) + 1);  // Increment the count if the character exists
            } else {
                name.put(c, 1);  // Add the character with a count of 1 if it's not in the map
            }
        }
        
        // Print the map that contains characters and their occurrences
        System.out.println(s + "   " + name);
    }
}


