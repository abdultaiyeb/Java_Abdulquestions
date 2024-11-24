package java_question;
import java.util.*;
public class FindDuplicateCharactersFromString {
    public static void main(String[] args) {
        String input = "Java programming";      
        input = input.replace(" ", "").toLowerCase();
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();  // Create a HashMap to store character counts
        
        char[] charArray = str.toCharArray();  // Convert the string to a character array
      
        for (char c : charArray) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1); // Count the frequency of each character
        }
     
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
            System.out.println(entry.getKey() + " = " + entry.getValue());  // Print the duplicate characters
            }}
        }}

        