package assignment5;

public class FindTypes {

	public static void main(String[] args) {
		// Here is the input
				//String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				//int  letter = 0, space = 0, num = 0, specialChar = 0;

				// Build the logic to find the count of each
				/* Pseudo Code:
					a) Convert the String to character array
					b) Traverse through each character (using loop)
					c) Find if the given character is what type using (if)
							i)  Character.isLetter
							ii) Character.isDigit
							iii)Character.isSpaceChar
							iv) else -> consider as special character
				

				// Print the count here
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

				*/
			String s= "$$ Welcome to 2nd Class of Automation $$ ";
				int letter=0, digit=0, space=0,splchar=0;
				int length=s.length();
				char[] array=new char[length];
				
				for(int i=0;i<length;i++) {
					array[i]=s.charAt(i);
//					System.out.println(array[i]);
				
					if(Character.isLetter(array[i])) {
						letter++;
						
					}
					else if(Character.isDigit(array[i])) {
						digit++;
						
					}
					else if(Character.isSpaceChar(array[i])) {
						space++;
						
						
					}
					else {
						splchar++;
						
					}}
					System.out.println("letter:"+ letter );
					System.out.println("Digit:" +digit);
					System.out.println("Space :" +space);
					System.out.println("Consider it as special character : " +splchar);
				
				
	}
}