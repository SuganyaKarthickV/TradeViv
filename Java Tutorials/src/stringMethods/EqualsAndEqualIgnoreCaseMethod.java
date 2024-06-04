package stringMethods;

public class EqualsAndEqualIgnoreCaseMethod {

	public static void main(String[] args) {
		
		//compare strings

		String s1="welcome";
		String s2="welcome";
		System.out.println(s1.equals(s2));           // true
		System.out.println(s1.equals("Welcome"));   //false   because W is uppercase
		System.out.println(s1.equalsIgnoreCase("Welcome"));   //true
		
	
	
	}
	
	

}
