package sortingprograms;
import java.util.*;

public class InsertionSort {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int length = sc.nextInt();
		
		int[] a = new int[length];
		System.out.println("Enter array values");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter sortOder: choose 1 for ascending or 2 for descending");
		int sortOrder= sc.nextInt();
		boolean ascending=sortOrder==1;
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		
		for(int i=1; i <a.length; i++)
		{
			int temp=a[i];
			int j=i-1;
			if(ascending)
			{
			while(j>=0 && a[j]> temp)
			{
				a[j+1] =a[j];
				j--;
			}
			a[j+1]=temp;
			}
			else
			{
			while(j>=0 && a[j]< temp)
			{
				a[j+1] =a[j];
				j--;
			}
			a[j+1]=temp;
			}
			
		}
		System.out.println("After sorting");
		if(ascending)
			System.out.println("Array sorted in ascending order :"+Arrays.toString(a));
		else
			System.out.println("Array sorted in descending order :"+Arrays.toString(a));

		

	}

}
