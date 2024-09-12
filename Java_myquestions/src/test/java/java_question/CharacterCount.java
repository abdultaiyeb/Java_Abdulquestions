package java_question;

import java.util.HashMap;
import java.util.Map;

// How To Count Occurrences Of Each Character In String In Java
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
