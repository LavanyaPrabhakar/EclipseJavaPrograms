//convert the alternative letters of the string in uppercase and lowercase then print the string
package stringlearning;

public class AlternativeCharUpper {
	public static void display(String str)
	{
		char[] ch= str.toCharArray();
		ch[0]=Character.toUpperCase(ch[0]);
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
				System.out.print(ch[i]);
			}
			else
			{
				ch[i]=Character.toLowerCase(ch[i]);
				System.out.print(ch[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		display("Buckingham");

	}

}
