package assignment5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1="stops";
		String text2="posts";
		
		if(text1.length()==text2.length()) {
			System.out.println("The Length of 2 strings are same" + text1.length());
			int c3=text1.length();
			System.out.println(c3);
		}else {
			System.out.println("The Length of 2 Strings are different"+ text1.length() + text2.length());
			
		}
		
		char[] c1=text1.toCharArray();
		char[] c2=text2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
			
			for(int i=0;i<c1.length;i++) {
				if(c1[i]==c2[i])
				{
		
			System.out.println("Both the arrays have same index "+ i);
		
				}
				else
				{
					System.out.println(" Both the arrays have Different index"  );
	}

}}
}