//convert the first letter of the string in uppercase and then print the string
package stringlearning;

public class FirstCharUppercase1 {
	public static void display(String str)
	{
		char[] ch= str.toCharArray();
		ch[0]=Character.toUpperCase(ch[0]);
		
	for(int i=1;i<ch.length; i++)
	{
		ch[i]=Character.toLowerCase(ch[i]);
	}
	 str=new String(ch);
	System.out.print(str);
	}
	public static void main(String[] args) {
		String testString= new String("bUCKINGHAM");
		display(testString);
	}

}
