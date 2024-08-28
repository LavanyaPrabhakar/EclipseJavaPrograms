/*
 Find the second min number in an array
 Steps:
 1. min=Integer.min_VALUE;
 2. smin=Integer.min_VALUE;
 
 Testcase1:
 Input a[] = {10,200,50,30,40}
 Output:
 min=10
 smin=30
 
 Testcase2:
 Input a[] = {-10,-200,-50,-30,-40}
 Output:
 min= -200
 smin= -50
 
 
 
 */
package arrayprograms;

public class ArraySecondMin {

	public static void main(String[] args) 
	{
	//	int[] a = {10,200,50,30,40};
		int[] a = {-10,-200,-50,-30,-40};
		int  min=Integer.MAX_VALUE;
		int  smin=Integer.MAX_VALUE;
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{ 
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println("min: "+min);
		System.out.println("min: "+smin);

	}

}

