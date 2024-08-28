/* Bubble Sort the given array into ascending order or descending order as per input from user
 * Find the maximum and second max number
 */
package sortingprograms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int length = sc.nextInt();

		int[] ar = new int[length];
		System.out.println("Enter array values");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i] = sc.nextInt();
		}
		
        // Input sorting order
        System.out.println("Choose Sorting Order: 1 for Ascending, 2 for Descending");
        int sortOrder = sc.nextInt();
        boolean ascending = sortOrder == 1;
		
		int temp = 0;
		System.out.println("Before sorting");
	/*	for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i] + " ");
		}	*/
		System.out.println(Arrays.toString(ar));
		for (int j = 1; j < ar.length; j++)
		{
			for (int i = 0; i < ar.length - j; i++) 
			{
				// for ascending order use if (ar[i] > ar[i + 1])
				// for descending order use if (ar[i] < ar[i + 1])
				if (ascending) {
					if (ar[i] > ar[i + 1]) {
						temp = ar[i];
						ar[i] = ar[i + 1];
						ar[i + 1] = temp;
					}
				}
				else if (ar[i] < ar[i + 1]) {
					temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("After sorting");
		System.out.println(Arrays.toString(ar));
		/*
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}	*/
		int n = ar.length;
		System.out.println();
		if(ascending)
		{
		System.out.println("Maximum number = " + ar[n - 1]);
		System.out.println("Second Maximum number = " + ar[n - 2]);
		}
		else
		{
			System.out.println("Minimum number = " + ar[n - 1]);
			System.out.println("Second Minimum number = " + ar[n - 2]);
			}
			

	}

}
