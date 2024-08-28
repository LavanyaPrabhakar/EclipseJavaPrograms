/*
 * Swap numbers inside an array
 * Input: a[] = {10,20,30,40,50}
 * Output: a[] = {50,40,30,20,10}
 * 
 * Steps:
 * temp=a[0]
 * a[0]=a[4]
 * a[4]= temp
 * 
 * temp=a[1]
 * a[1]=a[3]
 * a[3]= temp
 */
package arrayprograms;

public class ArrayNumberSwap {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int i = 0;
		int temp = 0;
		int j = a.length-1;
		
	//	for loop condition: i not equal to j
		for(i=0; i!=j; i++)
		{
			 temp=a[i];
			 a[i]=a[j];
			 a[j]= temp;
			 j--;
		
		 }
		for(i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
				 
		}
		

	}

}
