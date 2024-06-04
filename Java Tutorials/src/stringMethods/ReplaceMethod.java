package stringMethods;

public class ReplaceMethod {

	public static void main(String[] args) {
		
		
		// replace single or multiple(sequence) characters in a string
		
		String s= "welcome to selenium java";
		System.out.println(s.replace('e', 'x'));    // replace single character
		System.out.println(s.replace("selenium", "java"));
		
		
		String amount="$15,20,25";
		System.out.println(amount.replace("$",""));
		System.out.println(amount.replace("$","").replace(",",""));
	
	
	
	}

}
