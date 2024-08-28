/* Jagged Array: Get input for 2D Jagged array 
 * (uneven column length for each row from the user and print the array
 * Condition :
 * Row length=mark.length
 * column length=mark[row].length
 * 
 * Output:
20  40  
20  
40  50  60  40  
50  60  70  90  90  
90  12  23  34  56  78  
  
 */
package arrayprograms;
import java.util.Scanner;

public class Array2DJagged1 {

	public static void main(String[] args) {

		int[][] mark= new int[5][];
		mark[0] = new int[2];
		mark[1] = new int[1];
		mark[2] = new int[4];
		mark[3] = new int[5];
		mark[4] = new int[6];
		Scanner input = new Scanner(System.in);
		int row=0;
		int col = 0;
		for(row=0; row < mark.length; row++)
		{
			for(col=0; col < mark[row].length; col++)
			{
				System.out.println("Enter value");
				mark[row][col]= input.nextInt();
			}
		}
		
		for(row=0; row < mark.length; row++)
		{
			for(col=0; col < mark[row].length; col++)
			{
				System.out.print(mark[row][col]+"  ");
			}
			System.out.println();
		}
	}

}
