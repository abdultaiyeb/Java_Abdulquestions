package Selenium;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		        HashSet<String> set = new HashSet<>();

		        // Add elements to the HashSet
		        set.add("Apple");
		        set.add("Banana");
		        set.add("Orange");

		        // Print the HashSet
		        System.out.println("HashSet: " + set);

		        // Check if an element exists in the HashSet
		        if (set.contains("Banana")) {
		            System.out.println("Banana is present in the set.");
		        }

		        // Remove an element from the HashSet
		        set.remove("Apple");
		        System.out.println("After removing 'Apple': " + set);

		        // Get the size of the HashSet
		        System.out.println("Size of the HashSet: " + set.size());

		        // Iterate over the elements in the HashSet
		        System.out.println("Iterating over HashSet elements:");
		        for (String item : set) {
		            System.out.println(item);
		        }

		        // Convert the HashSet to an array
		        Object[] array = set.toArray();
		        System.out.println("HashSet elements as an array:");
		        for (Object obj : array) {
		            System.out.println(obj);
		        }

		        // Clear all elements from the HashSet
		        set.clear();
		        System.out.println("HashSet after clearing all elements: " + set);

		        // Check if the HashSet is empty
		        if (set.isEmpty()) {
		            System.out.println("HashSet is empty.");
		        }
		    }
		}

	

