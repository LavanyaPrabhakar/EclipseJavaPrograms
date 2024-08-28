/*Linear Search in an array and a key value will be given.
 * Find the given key value in an array and display whether it is present or not.
 * Testcase 1:
 * Input: a[] = {10,20,30,40,50}
 * Key= 30;
 * Output: Key is present

 * Testcase 2:
 * Input: a[] = {10,20,40,50}
 * Key= 30;
 * Output: Key is not present
 * 
 * Note:
 * set boolean keyValue = false and use it in condition to check
 
 */

package arrayprograms;

public class ArraySearchKeyValue 
{

	public static void main(String[] args)
	{
	//	int[] a = {10,20,30,40,50};
		int[] a = {10,20,40,50};
		int key= 30;
		boolean keyValue = false;
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==30)
			{
				keyValue = true;	
				System.out.println("Key is present");
			}
		}
			if (keyValue ==false)
			{
			System.out.println("Key is not present");
			}
		

	}

}
