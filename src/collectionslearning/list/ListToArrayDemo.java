/*Convert List to Array using get()
 * 
 * 
 * 
 */

package collectionslearning.list;

import java.util.LinkedList;
import java.util.List;

public class ListToArrayDemo {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		String[] s ={"Abbie","Bobbie","Chloe","Derby"};
		
		//Add elements from s to List
		for(int i=0; i< s.length;i++)
		{
			list.add(s[i]);
		}
		System.out.println("Objects in List : "+list);
/*		
		//Instantiate an array 'arr'
		
		String[] arr = new String[list.size()];
		
		// Method 1: Convert List to Array using get()
		for(int i=0; i< list.size();i++)
		{
		arr[i] = list.get(i);	
		}
		
		// Method 2: Convert List to Array using
		Object[] ar=list.toArray();
		
		String[] arr = list.toArray(new String[list.size()]);
		//String[] arr = list.toArray(String[]:: new);
	*/	
		
		String[] arr = list.stream().toArray(String[]:: new);
		
		
		
		System.out.print("String elements in Array : ");
		for(String s1:arr)
		{
			System.out.print(s1+" ");
		}
	}

}
