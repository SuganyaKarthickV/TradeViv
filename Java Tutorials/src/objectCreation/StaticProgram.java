package objectCreation;

public class StaticProgram {
	
	static int empid;
	static String empname;

	static void getdetails()
	{
		System.out.println("enter employee id:"+empid);
		System.out.println("enter employee name:"+empname);

	}
	
	public static void main(String[] args) {
		
		empid=001;
		empname="suganya";
		getdetails();
		
		
	}

}
