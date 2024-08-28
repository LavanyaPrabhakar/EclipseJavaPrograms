/*
 * Swap first and last numbers inside an array
 * Input: a[] = {10,20,30,40,50}
 * Output: a[] = {50,20,30,40,10}
 * 
 * Steps:
 * temp=a[0]
 * a[0]=a[4]
 * a[4]= temp
 * 

 */
package arrayprograms;

public class ArraySwapFirstLast {

	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50};
		int i = 0;
		int temp = a[0];
		a[0]=a[a.length-1];
		a[a.length-1]= temp;

		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
