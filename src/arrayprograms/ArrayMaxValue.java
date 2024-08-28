/* Find the maximum number in an array
 * Input a[]={10,200,50,320,40}
 * Output max=200
 * Testcase1: All negative values -> int[] a= {-10,-200,-50,-30,-40};
 * Output max= -10
 * Testcase2: int[] a= {-0,-200,-50,-30,-40};
 * Output max= 0
 * 
 * 
 
 */
package arrayprograms;

public class ArrayMaxValue 
{

	public static void main(String[] args) 
	{
	//	int[] a= {10,200,50,30,40};
		int[] a= {-0,-200,-50,-30,-40};
		int max=Integer.MIN_VALUE;
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{max=a[i];}
		}
		System.out.println(max);
	}

}
