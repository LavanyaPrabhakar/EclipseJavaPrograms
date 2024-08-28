/*Extract and display only the negative numbers from the given array.
 * a[] = {-10.20.30,40, -50, -60}
 * Step 1: Find the number of negative values(if a[i]< 0) in the array to set the array length b[negative]
 * Step 2: Extract only the negative numbers from the given array and display
 */
package arrayprograms;

public class ArrayExtractNegNum 
{

	public static void main(String[] args) 
	{
		int[] a = {-10, 20, 30,40, -50, -60};
		
		int i = 0, negative = 0, j= 0;
		for(i=0; i<a.length; i++)
		{
			if (a[i]< 0)
				negative++;
		}
		System.out.println("Total negative numbers= "+ negative);
		
		int[] b = new int[negative];
		for(i=0; i<a.length; i++)
		{
			if (a[i]< 0)
			{
			b[j] = a[i];
			j++;
			}
		}
		for(i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}

}
