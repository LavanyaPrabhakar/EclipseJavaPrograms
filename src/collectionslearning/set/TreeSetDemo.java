/*SortedTreeSet:
 * No duplicates allowed
 * sorting order: Natural/Comparator Specified will be maintained
 * Since sorting occurs- it will allow homogenous object 
 * can't include : sts.add('c'); to the below sts TreeSet as it has number type objects
 * When used will throw ClassCastException
 * When null value is added: sts.add(null);- will throw NullPointerException
 */

package collectionslearning.set;

import java.util.TreeSet;

public class TreeSetDemo {
		
		public static void main(String[] args)

		{
			TreeSet sts = new TreeSet();
			sts.add(100);
			sts.add(10);
			sts.add(200);
			sts.add(50);
			sts.add(70);			
			sts.add(100);
			//can't include : sts.add('c'); When used will throw ClassCastException
			System.out.println("Check for Duplication allowed?  :"+sts.add(100));
			System.out.println("Natural(Ascending) sorting order without duplicates :");
			//dupe 100 not allowed but displayed insertion order
			System.out.println(sts);

		}
}


