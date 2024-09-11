/*Create a LinkedList that has duplicates
 * LinkedList - will maintain Insertion order
 * 
 * Remove duplicates and maintain natural(ascending order) 
 */

package collectionslearning.set;

import java.util.LinkedList;
import java.util.TreeSet;

public class RemoveDupSortOrder {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.add(200);
		ll.add(20);
		ll.add(100);
		ll.add(10);
		ll.add(50);
		ll.add(56);
		ll.add(100);
		ll.add(10);
		ll.add(50);
		ll.add(56);
		System.out.println("LinkedList insertion order :"+ll);
		TreeSet ts= new TreeSet(ll);
		System.out.println("TreeSet Ascending order without duplicates :"+ts);
		

	}

}
