/*
 Find the second max number in an array
 Steps:
 1. max=Integer.MIN_VALUE;
 2. smax=Integer.MIN_VALUE;
 
 Testcase1:
 Input a[] = {10,200,50,30,40}
 Output:
 max=200
 smax=50
 
 Testcase2:
 Input a[] = {-10,-200,-50,-30,-40}
 Output:
 max= -10
 smax= -30
 
 
 
 */
package arrayprograms;

public class ArraySecondMax {

	public static void main(String[] args) 
	{
	//	int[] a = {10,200,50,30,40};
		int[] a = {-10,-200,-50,-30,-40};
		int  max=Integer.MIN_VALUE;
		int  smax=Integer.MIN_VALUE;
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{ 
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println("max: "+max);
		System.out.println("max: "+smax);

	}

}
