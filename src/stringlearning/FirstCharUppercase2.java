//Convert first letter of the string to uppercase and the rest to lowercase then print the string.
//Note use subString(), toLowercase()  and toUpperCase() methods
package stringlearning;

public class FirstCharUppercase2 {
	public static void display(String str)
	{
		System.out.println((str.substring(0, 1).toUpperCase())+
				(str.substring(1, str.length()).toLowerCase()));
	
		
	}

	public static void main(String[] args) {
		String testString= new String("bUCKINGHAM");
		display(testString);

	}

}
