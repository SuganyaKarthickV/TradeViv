package stringMethods;

public class ContainsMethod {

	public static void main(String[] args) {
		
		// returns true or false 
		//checks string is part of main string or not.
		String s="welcome";
		System.out.println(s.contains("wel"));   //true
		System.out.println(s.contains("Wel"));   //false because case sensitive
		System.out.println(s.contains("wle"));   //false because sequence is important

	}

}
