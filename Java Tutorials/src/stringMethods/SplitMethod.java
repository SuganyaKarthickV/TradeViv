package stringMethods;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {


		// split the string into multiple parts based on delimeter
		
		String s="abc@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		String s1= "abc,123@xyz";
		String arr[]=s1.split(",");
		System.out.println(Arrays.toString(arr));
		
		String arr1[]= arr[1].split("@");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);

		
		// * % ( ) - ^ - not possible
	}

}
