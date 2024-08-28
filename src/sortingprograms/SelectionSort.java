package sortingprograms;

import java.util.Arrays;

public class SelectionSort 
{
	public static void main(String args[]) 
	{
		int arr[] = {64, 25, 12, 22, 11};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
public static void sort(int arr[]) 
	{
      
		for (int i = 0; i < arr.length-1; i++) 
		{
    		int minIndex = i;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[j] < arr[minIndex])
				{	minIndex = j;}

			}
			// Swap 
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;


		}
}
}
