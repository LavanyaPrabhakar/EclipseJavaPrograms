/*Display only the Odd Place Values of an Array.
 * Input: a[] = {10, 20,30, 40, 50}
 * 
 * Steps:
 * Find length of b[a.length/2]
 * i=1 & i+=2 in for loop
 */
package arrayprograms;

public class ArrayOddPlaceValues 
{

	public static void main(String[] args) 
	{
		int a[] = {10, 20,30, 40, 50};
		int[] b= new int[a.length/2];
		int i = 0, j = 0;
		for(i=1; i<a.length; i+=2)
		{
			b[j] = a[i];
			j++;
		}
		for(i=0; i<b.length; i++)
		{
			System.out.println(b[i]);	
		}
		
	}

}
