package java_question;


/* Different Methods in String Class:
1. length()
2. charAt()
3. indexOf()
4. SubString()
5. equal/equalsIgnoreCase() - String Comparison 
6. trim()
7. replace()
8. split()
9. concat()
10. String Concatenation using + operator
*/

public class stringMethods {

	public static void main(String[] args) {
		
		    String str = "It started raining yesterday and hasn't stopped yet";
		    String str1 = "It started Raining yesterday and hasn't stopped yet";

		    // 1. length()
		    System.out.println(str.length()); // Output: 51
		    // Explanation: Returns the number of characters in the string.

		    // 2. charAt()
		    System.out.println(str.charAt(5)); // Output: a
		    // Explanation: Returns the character at the specified index (0-based).

		    // 3. indexOf()
		    System.out.println(str.indexOf('s')); // Output: 3
		    // Explanation: Returns the index of the first occurrence of the specified character.
		    
		    System.out.println(str.indexOf('s', str.indexOf('s') + 1)); // Output: 21
		    // Explanation: Returns the index of the next occurrence of the specified character after the given index.
		    
		    System.out.println(str.indexOf("and")); // Output: 29
		    // Explanation: Returns the index of the first occurrence of the specified substring.
		    
		    System.out.println(str.indexOf("hello")); // Output: -1
		    // Explanation: Returns -1 if the substring is not found.

		    // 4. equals() and equalsIgnoreCase()
		    System.out.println(str.equals(str1)); // Output: false
		    // Explanation: Compares two strings for equality (case-sensitive).
		    
		    System.out.println(str.equalsIgnoreCase(str1)); // Output: true
		    // Explanation: Compares two strings for equality (case-insensitive).

		    // 5. substring()
		    System.out.println(str.substring(0, 10)); // Output: It started
		    // Explanation: Returns a new string that is a substring of the original string.

		    // 6. trim()
		    String s = "  Hello World  ";
		    System.out.println(s.trim()); // Output: Hello World
		    // Explanation: Removes whitespace from both ends of the string.

		    // 7. replace()
		    System.out.println(s.replace(" ", "")); // Output: HelloWorld
		    // Explanation: Replaces all occurrences of a character or substring with another character or substring.
		    
		    String date = "01-01-2017";
		    System.out.println(date.replace("-", "/")); // Output: 01/01/2017
		    // Explanation: Replaces all occurrences of "-" with "/".

		    // 8. split()
		    String test = "Hello_World_Test_Selenium";
		    String[] testval = test.split("_");
		    for (int i = 0; i < testval.length; i++) {
		        System.out.println(testval[i]);
		    }
		    // Explanation: Splits the string into an array of substrings based on the specified delimiter.

		    // 9. concat()
		    String s2 = "cares";
		    System.out.println(s2.concat("s")); // Output: caress
		    // Explanation: Concatenates the specified string to the end of this string.

		    // 10. String Concatenation using + operator
		    String x = "Hello";
		    String y = "World";
		    int a = 100;
		    int b = 200;

		    System.out.println(x + y); // Output: HelloWorld
		    System.out.println(a + b); // Output: 300
		    System.out.println(x + y + a + b); // Output: HelloWorld100200
		    System.out.println(a + b + x + y); // Output: 300HelloWorld
		    System.out.println(x + y + (a + b)); // Output: HelloWorld300
		    // Explanation: Concatenates strings using the + operator. Note the order of operations.
		}

}
