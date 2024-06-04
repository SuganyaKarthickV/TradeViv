package stringMethods;

public class SampleProgram1 {

	public static void main(String[] args) {
		
		String s="abc123";
		//System.out.println(s.length());
		
		//String s[]= {"welcome"};
		
		
		char c[]=s.toCharArray();
		//System.out.println(c.length);
		
		/*for(int i=0;i<=c.length-1;i++)
		{
			if()
			System.out.println(s.charAt(i));
		}*/
		
		int i=0;
		int num=0;
		int ch = 0;
		
		while(i<=c.length-1)
		{
			if(i>=3)
			{
				ch=c[i];
				num=num+ch;
				i++;
				//System.out.println(s.charAt(i));
				System.out.println(num);
				break;
			}
			
			else
			{
				System.out.print(c[i]);
				i++;
			}
			
			
		}

	}

}
