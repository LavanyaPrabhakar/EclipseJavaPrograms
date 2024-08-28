/* Find the frequency of elements in an array
  Input: 		 a =	{10,20,30,40,50,10,20,30,40,50,10,20,30,10};
Output 1:	  freq =  	{4, 3, 3 ,2 ,2 ,-1,-1,-1,-1,-1,-1,-1,-1,-1};
 */
package arrayprograms;

public class ArrayFreqValue 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50,10,20,30,40,50,10,20,30,80};
		int[] freq = new int[a.length];
		int i=0;
		for(i=0;i<a.length;i++)
		{
			int key=a[i];
			int count=1;
			
			for(int j=i+1;j<a.length;j++)
			{ 
				if(a[j]==key)
					{
					freq[j]=-1;
					count++;
					}
				
			}
			
			if(freq[i]!=-1)
			{
			freq[i]=-1;
			freq[i]=count;
			}
		}
		
		for(i=0;i<a.length;i++)
		{
			// if(freq[i]>0)
			
			//	System.out.println(a[i]+" occurs "+ freq[i]+" times ");	
				System.out.print(freq[i]+"   ");
					
		}
		
		
	}
}