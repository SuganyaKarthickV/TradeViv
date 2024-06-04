package stringMethods;

import java.util.Arrays;

public class ToUppercaseAndToLowercase {

	public static void main(String[] args) {
		
		
		String s="welCome";
		//System.out.println(s.toUpperCase());
		//System.out.println(s.toLowerCase());
		
		
		//String s1="hello";
		//System.out.println(s1.replace('h', 'H'));
		//System.out.println(s1.toUpperCase());
		
		
		int num;
		//char str=Character.toUpperCase(s.charAt(1));
		char a[]=s.toCharArray();
		//System.out.println(a.length);
		//for(char c: a)
		//{ 
		for( int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(a[i]==1)
			
				
			//if(a[1]!=s.toUpperCase().charAt(1))
			{
				//System.out.print(s.toUpperCase().charAt(1));
				System.out.print(Character.toUpperCase(s.charAt(1)));
				
				
			}
			
			
		}
			//System.out.print(c+ " ");
			
			
			//System.out.println(c.charAt(1));
		//}
		//String str=Arrays.toString(c);
		//num=c.charAt(1);
		//System.out.println(c.toUpperCase().);
		//System.out.println(s.toUpperCase().charAt(1));
	}

}
 