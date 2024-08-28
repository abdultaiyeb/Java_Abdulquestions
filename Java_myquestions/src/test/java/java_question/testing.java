package java_question;

import java.util.Scanner;

public class testing {

    public static void main(String[] args) {
        
        int originalnum= 12345321;
        int newnumber= 123454321;
        int reversenum=0;
        while(originalnum!=0) {
        	reversenum= reversenum*10 + originalnum%10;
        	originalnum= originalnum/10;
        }
        
    	System.out.println(reversenum);

        if(newnumber==reversenum) {
        	System.out.println("is palindrome");
        }
        else {
        	System.out.println("is not palindrome");
        }
    }
}
