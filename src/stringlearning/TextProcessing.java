package stringlearning;
import java.util.regex.*;

public class TextProcessing {

	public static void main(String[] args) {
		String s1=" Buchingham Palace London United Kingdom ";
		String[] s2=s1.split("\\s");
		for(String ss:s2)
		{
			System.out.println(ss);
		}
		
		System.out.println(s1.replace('i', 'e'));
		System.out.println(s1.replace("Pa", "Pe"));
		System.out.println(s1.replaceAll("\\s", "_"));
		System.out.println(s1.matches(" \\w{10} \\w{6} \\w{6} \\w{6} \\w{7} "));
		System.out.println(s1.matches(" \\w{10}(.*)"));
		System.out.println(s1.replaceFirst("\\s", "_" ));
		System.out.println(String.join("-","18","12","2005"));
		System.out.println(String.valueOf(5));
	}

}
