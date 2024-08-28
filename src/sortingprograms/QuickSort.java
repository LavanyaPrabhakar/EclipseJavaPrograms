package sortingprograms;

import java.util.Arrays;

public class QuickSort 
{
	 // Main method to test the algorithm
    public static void main(String[] args) 
	{
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:"+Arrays.toString(arr));
     
    }
	
	   // Method to perform quicksort
    private static void quickSort(int[] arr, int low, int high)
	{
        if (low < high) {
            int pi = partition(arr, low, high);
            if (low < pi - 1) {
                quickSort(arr, low, pi - 1);
            }
            if (pi < high) {
                quickSort(arr, pi, high);
            }
        }
    }

    // Method to partition the array on the basis of pivot
    private static int partition(int[] arr, int low, int high) {
        int pivotIndex = low + (high - low) / 2;
        int pivot = arr[pivotIndex];
        int start = low;
        int end = high;

        while (start <= end) 
		{
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) 
			{
                int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }

 

}
