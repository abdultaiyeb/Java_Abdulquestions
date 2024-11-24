package Selenium;
import java.util.*;

public class test{
	
	public static void main(String[] args) {
		String str= "programming";
		duplicates(str);
		
		
}

	private static void duplicates(String str) {
		HashMap<Character,Integer> map= new HashMap<>();
		char[] arr= str.toCharArray();		
		for(char c:arr) {
			map.put(c, map.getOrDefault(c,0)+1);
			
		}
		
	}}