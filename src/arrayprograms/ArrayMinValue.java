/* Find the minimum number in an array
 * Input a[]={10,200,50,30,40}
 * Output min=10
 * Testcase1: All negative values -> int[] a= {-10,-200,-50,-30,-40};
 * Output max= -200
 * Testcase2: int[] a= {-0,00,20,30,-40};
 * Output min= -40
 * 
 * 
 
 */
package arrayprograms;


public class ArrayMinValue {

	public static void main(String[] args)
	{
		int[] a= {10,200,50,30,40};
	//	int[] a= {-0,-200,-50,-30,-40};
	//	int[] a= {-0,00,20,30,-40};
		int min=Integer.MAX_VALUE;
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{min=a[i];}
		}
		System.out.println(min);

	}

}
