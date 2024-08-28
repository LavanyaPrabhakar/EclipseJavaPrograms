/*
 * Right shift numbers inside an array
 * Input: a[] = {10,20,30,40,50}
 * Output: a[] = {50,10,20,30,40}
 * 
 * Steps:
 * temp=a[a.legth-1]
 * a[a.legth-1]=a[a.legth-2]
 * a[i]= temp
 * 

 */
package arrayprograms;

public class ArrayRightShift {

	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50};
		int i = 0;
		int temp = a[a.length-1]; 
		
		
		for(i=a.length-1;i>=1;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;

		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
