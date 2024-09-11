/*No duplicates allowed
 *No order maintained
 * 
 */
package collectionslearning.set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args)

	{
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(10);
		hs.add(200);
		hs.add(50);
		hs.add(70);
		hs.add(100);
		System.out.println("Check for Duplication allowed?  :"+hs.add(100));
		System.out.println("No order :"+hs);
		
	}
}
