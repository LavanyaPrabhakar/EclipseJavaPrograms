/*FileHandling
 * Read input from a text file
 * Using Regular Expression find whether the given UK mobile number is valid or not
 * Sample text file input with different UK mobile numbers:
 * John:+44 7447488986
 * Nichola:07447488986
 * victor:07222 555555
 * Chloe:(07222) 555555
 * Patrick:+44 7222 555 555
 * Joseph:06945867200
 * Mat:9194586720
 */

package regexprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidation {

	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\LPrab\\OneDrive\\Documents\\Lavanya_Tutorial\\New Tutorial\\JavaLesson\\SampleFile.txt");
		Scanner scan = new Scanner(file);
			
		while(scan.hasNext())
		{
			String line = scan.nextLine();
			String[] parts = line.split(":");
			String mobile = parts[1].trim();
                      
            Pattern p = Pattern.compile("^(\\+44\\s?7\\d{3}|\\(?07\\d{3}\\)?)\\s?\\d{3}\\s?\\d{3}$");
            Matcher m = p.matcher(mobile);
            
            if(m.matches())
            { System.out.println(mobile + " is a valid UK mobile number");}
            else 
            { System.out.println(mobile + " is not a valid UK mobile number");}         
         } 
		scan.close(); 
        }	      
	}


