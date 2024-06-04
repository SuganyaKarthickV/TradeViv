package stringMethods;

import java.util.Scanner;

public class LengthMethod {

	public static void main(String[] args) {
		
		/* String s = "welcome";
		//int l = s.length();  // it returns a length of a string
		System.out.println("The Length of a given string is : " + s.length()); */
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		int l = s.length();
		System.out.println("The length of given string is :" + l);
		
				

	}

}
