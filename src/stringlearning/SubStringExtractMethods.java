package stringlearning;

public class SubStringExtractMethods {

	public static void main(String[] args) {
		String s1 = "Buchingham Palace London United Kingdom";
		// Method 1: charAt(index)
		System.out.println(s1.charAt(0));

		// Method 2: substring(String str)
		System.out.println(s1.substring(11));

		// Method 3: substring(beginIndex, endIndex)
		// index range(0-38) hence endIndex 39(as exclusive)
		System.out.println(s1.substring(11, 39));

		/*
		 * Method 4: subSequence(beginIndex, endIndex) index range(0-38) hence endIndex
		 * 39(as exclusive) returns a charSequence- which is an interface charSequence
		 * will be mutable and immutable. However no diiference in output
		 */

		System.out.println(s1.subSequence(11, 39));

	}

}
