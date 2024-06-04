package javaPrograms;

import java.util.Arrays;

public class SwapNumbers {

	public static void main(String[] args) {
		 
		int a[]= {1,2,3,4};
		System.out.println(a.length);
		
		int temp=0;
		System.out.println("Before swaping an elements:" + Arrays.toString(a));
		/*temp=a[1];
		a[1]=a[2];
		a[2]=temp;
		System.out.println("After swaping an elements:" + Arrays.toString(a));*/
		
		for(int i=0;i<=a.length-1;i++)
		{
			
			if(i==1 || i==2)
				{
				
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			
				System.out.print(Arrays.toString(a));
				//System.out.println(a[i]);
				break;
		
				}
			
			//else
			//System.out.print(Arrays.toString(a));
			
		}
	}

}
