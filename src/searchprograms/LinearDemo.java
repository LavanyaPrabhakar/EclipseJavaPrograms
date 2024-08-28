/* Search an integer value in a single dim array and return its index value and int and boolean
 * Search a char value in a string  and return its index value and int and boolean
 * Search an integer value in a two dim array  and return its index value and integer array
 */

package searchprograms;

import java.util.Arrays;

public class LinearDemo {

	public static void main(String[] args) {
		
		int[] ar= {10,20,30,45,65,70};
		
		System.out.println("Index position = "+LinearSearching.find(ar, 65));
				
		System.out.println("target present in array  = "+LinearSearching.contains(ar, 65));
		
		String name = "Willamson";
		System.out.println("Index position = "+LinearSearching.find(name, 'n'));
		System.out.println("target present in array  = "+LinearSearching.contains(name, 'n'));
		
		// Two Dimensional; array
		int[][] twoDimArray= {{2,8,4},{9,4,6},{5,1,7}};
		
		int[]  result = LinearSearching.find(twoDimArray, 6);
		System.out.println(Arrays.toString(result));
	}

}
