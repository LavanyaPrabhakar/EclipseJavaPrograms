package sortingprograms;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args)
	{
		int[] array={5,3,10,2,15,22,16,20};
		mergeSort(array,0,array.length);
		System.out.println(Arrays.toString(array));
		
	}
public static void mergeSort(int[] arr,int start,int end) //recursion
{
	
	if((end-start)==1)
	return;
	
	int mid=(start+end)/2;
	
	mergeSort(arr,start,mid);
	mergeSort(arr,mid, end);
	merge(arr,start,mid, end);
	


}

public static void merge(int[] arr,int s,int m,int e)
{

	//intializing pointers and temp array( with k pointer) where i is for first half and j is for second half of the array 
	int[] joined = new int[e-s];
	int i=s;
	int j=m;
	int k=0;
	
	while ((i<m) && (j<e))
	{
		if(arr[i] < arr[j])
		{
			joined[k++] = arr[i++];
		}
		else
		{
			joined[k++] = arr[j++];
		}
	
	}
	while (i<m) 
	{
		joined[k++] = arr[i++];
	}
		
	while (j<e) 
	{
		joined[k++] = arr[j++];
	}
	for( k=0; k<joined.length; k++)
	{
		arr[s+k]=joined[k];
	}
	
}


}
