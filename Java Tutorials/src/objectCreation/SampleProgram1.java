package objectCreation;

import java.util.Scanner;

public class SampleProgram1 {

	public void getdetail()
	{
		String name;
		int rollNo;
		//name="Suganya";
		//rollNo=01;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=in.nextLine();
		Scanner s=new Scanner(System.in);
		System.out.print("Rollno:");
		rollNo=s.nextInt();
	}
		
	public static void main(String[] args)
	{
		SampleProgram1 stu= new SampleProgram1();
		stu.getdetail();
	}
		
	}

