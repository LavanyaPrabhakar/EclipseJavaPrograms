package searchprograms;

public class BinarySearch {

	// Method to perform binary search
    public static int binarySearch(int[] array, int key, boolean isAscending) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
        	int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid;
            }

            if (isAscending) {
            	if (array[mid] < key) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
            	if (array[mid] > key) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Key not found
    }

    // Method to determine if the array is sorted in ascending order
    public static boolean isAscending(int[] array) {
        return array[0] < array[array.length - 1];
    }

    public static void main(String[] args) 
    {
        int[] ascendingArray = {1, 3, 5, 7, 9, 11,13};
        int[] descendingArray = {13,11, 9, 7, 5, 3, 1};

        int key = 1;

        // Determine the order of the array and perform binary search
		
        boolean isAsc = isAscending(ascendingArray);
        
        int result = binarySearch(ascendingArray, key, isAsc);
        System.out.println("key is at ascending array  index: " + result);

        isAsc = isAscending(descendingArray);
        
        result = binarySearch(descendingArray, key, isAsc);
        System.out.println("key is at descending array index: " + result);
    }

	}


