package stringMethods;

public class TrimMethod {

	public static void main(String[] args) {
		
		// remove spaces right and left side
		String s = "   welcome   ";
		
		System.out.println(s); // print string along with spaces
		System.out.println("Before trimming:" + s.length());
		
		System.out.println(s.trim());
		System.out.println("After trimming:" + s.trim().length());

	}

}
