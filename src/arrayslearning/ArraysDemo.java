package arrayslearning;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {20,10,30};
		
		System.out.println("Before sorting:");
		for(int i=0; i<b.length; i++)
		System.out.print(b[i]+" ");
		System.out.println();
		Arrays.sort(b);
		
		System.out.println("After sorting in Ascending order:");
		for(int i=0; i<b.length; i++)
		System.out.print(b[i]+" ");
		System.out.println();
		
		
		String[] names = {"John", "Joseph", "Isabella", "Rebacca"};
		
		System.out.println("Before sorting:");
		for(int i=0; i<names.length; i++)
		System.out.print(names[i]+" ");
		System.out.println();
		
		Arrays.sort(names);
		
		System.out.println("After sorting in Lexicographical order:");
		for(int i=0; i<names.length; i++)
		System.out.print(names[i]+" ");
		System.out.println();
		
		//Dynamic Binding
		
	/*	1. sorting in Descending Order
	 	ComparatorDemo comp = new ComparatorDemo();
		Arrays.sort(names,comp);
		System.out.println();
		
		System.out.println("After sorting in Descending Order:");
		for(int i=0; i<names.length; i++)
		System.out.print(names[i]+" ");
		System.out.println();
		
	*/	// 2. sorting in Descending Order & lengthwise
		ComparatorDemo comp = new ComparatorDemo();
		Arrays.sort(names,comp);
		System.out.println();
		
		System.out.println("After sorting in Descending Order & lengthwise:");
		for(int i=0; i<names.length; i++)
		System.out.print(names[i]+" ");
		System.out.println();
		
		
	}

}
