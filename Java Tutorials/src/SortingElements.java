import java.util.Arrays;

public class SortingElements {

	public static void main(String[] args) {

		int a[]= {50,20,40,10,100};
		
		System.out.println("Before sorting an elements:" + Arrays.toString(a));
		int n= a.length;
		for (int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting an elements:" + Arrays.toString(a));
	}

}
