/*Create an array with Integer.MAX_VALUE as length of an array
Error: OutOfMemoryError: Requested array size exceeds VM limit
Reason: an array needs continuous memory which exceeds VM limit when Integer.MAX_VALUE 
is given as length of an array
*/
package arrayprograms;

public class ArrayLength {

	public static void main(String[] args)
	{
		int[] a = new int[Integer.MAX_VALUE];
		System.out.println(Integer.MAX_VALUE);

	}

}
