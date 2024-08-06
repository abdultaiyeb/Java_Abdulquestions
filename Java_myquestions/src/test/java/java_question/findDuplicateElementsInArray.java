package java_question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//How to Find Duplicates Elements in Java Array?

public class findDuplicateElementsInArray {

	public static void main(String[] args) {
		
		String[] names = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "Ruby"};

		        // Method 1: Using a Nested Loop
		        System.out.println("Duplicates using Nested Loops:");
		        for (int i = 0; i < names.length; i++) {
		            for (int j = i + 1; j < names.length; j++) {
		                if (names[i].equals(names[j])) {
		                    System.out.println("Duplicate element is: " + names[i]);
		                }
		            }
		        }
		        
		        

		        // Method 2: Using HashSet
		        System.out.println("Duplicates using HashSet:");
		        Set<String> store = new HashSet<>();
		        for (String name : names) {
		            if (!store.add(name)) {
		                System.out.println("Duplicate element is: " + name);
		            }
		        }
		        

		        // Method 3: Using HashMap
		        System.out.println("Duplicates using HashMap:");
		        Map<String, Integer> storeMap = new HashMap<>();
		        for (String name : names) {
		            Integer count = storeMap.get(name);
		            if (count == null) {
		                storeMap.put(name, 1);
		            } else {
		                storeMap.put(name, ++count);
		                if (count == 2) {
		                    System.out.println("Duplicate element is: " + name);
		                }
		            }
		        }
		    }
		


	

}
