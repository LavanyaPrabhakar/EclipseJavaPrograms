/*Display only the even Place Values of an Array.
 * Input: a[] = {10, 20,30, 40, 50}
 * 
 * Steps:
 * Find length of b[a.length/2+1]
 * i=0 & i+=2 in for loop
 */
package arrayprograms;

public class ArrayEvenPlaceValues {

	public static void main(String[] args) 
	{
		int a[] = {10, 20,30, 40, 50};
		int[] b= new int[(a.length/2)+1];
		int i = 0, j = 0;
		for(i=0; i<a.length; i+=2)
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
