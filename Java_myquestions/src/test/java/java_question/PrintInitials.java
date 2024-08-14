package java_question;

import java.util.Scanner;
//Question: Write a Java program to input name, middle name and surname of a person and print only the initials. 
public class PrintInitials {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompting user to enter first name
	        System.out.print("Enter first name: ");
	        String firstName = scanner.nextLine().trim();

	        // Prompting user to enter middle name
	        System.out.print("Enter middle name: ");
	        String middleName = scanner.nextLine().trim();

	        // Prompting user to enter surname
	        System.out.print("Enter surname: ");
	        String surname = scanner.nextLine().trim();

	        // Printing the initials
	 System.out.println("Initials: " + getInitial(firstName) + getInitial(middleName) + getInitial(surname));
	        
	        scanner.close();
	    }

	    // Method to get the initial of a name (first letter)
	    private static String getInitial(String name) {
	        if (name.isEmpty()) {
	            return "";  // Return empty string if the name is empty
	        }
	        return name.substring(0, 1).toUpperCase() + ".";
	    }

}
