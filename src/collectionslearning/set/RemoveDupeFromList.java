/* Remove duplicates from linkedlist usung  linkedhashset
 * convert linkedlist items to array and print
 * convert linkedhashset items to array and print
 * Add userdefined object into linkedlist items and print
 * Multiple null value allowed in LinkedList
 * Only one null value allowed in HashSet/LinkedHashSet
 */

package collectionslearning.set;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDupeFromList {
	public String toString()
	{
		return "ABC";
		
	}
	public static void main(String[] args)

	{
		LinkedList ll = new  LinkedList();
		ll.add(100);
		ll.add(10);
		ll.add(200);
		ll.add(50);
		ll.add(70);
		ll.add(100);
		ll.add(null);
		ll.add(null);
		
		RemoveDupeFromList rdfl= new RemoveDupeFromList();
		ll.add(rdfl);
		System.out.println("Display list items :"+ll);
		Object[] ol=ll.toArray();
		for(Object o:ol)
		{	System.out.print(o+" ");}

		System.out.println();
		LinkedHashSet hs = new LinkedHashSet(ll);
		
		Object[] oh=hs.toArray();
				for(Object b:oh)
		{	System.out.print(b+" ");}
				System.out.println();
		
		//dupe 100 not allowed but displayed insertion order
		System.out.println("Display hashset items after removing duplicates :"+hs);

	}

}
