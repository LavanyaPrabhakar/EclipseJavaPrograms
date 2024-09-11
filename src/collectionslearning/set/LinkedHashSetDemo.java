/*class LinkedHashSet:
 * No duplicates allowed
 * insertion order allowed
 */
package collectionslearning.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args)

	{
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(100);
		hs.add(10);
		hs.add(200);
		hs.add(50);
		hs.add(70);
		hs.add(100);
		System.out.println("Check for Duplication allowed?  :"+hs.add(100));
		//dupe 100 not allowed but displayed insertion order
		System.out.println("Insertion order without duplicates :"+hs);

	}
}
