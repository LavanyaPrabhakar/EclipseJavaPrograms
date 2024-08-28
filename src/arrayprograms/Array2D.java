/* 1. Get input for 2D array from the user 
 * 2. print each row and its total.
 * 3. Find total value of diagonal.
 * 4. print each column and its total.
 */

package arrayprograms;
import java.util.Scanner;

public class Array2D
{

	public static void main(String[] args)
	{
		int[][] a = new int[3][3];
		Scanner input = new Scanner(System.in);
		int row=0;
		int col=0;
		//  1. Get input for 2D array from the user
		for(row=0; row<3; row++)
		{
			for(col=0; col<3; col++)
			{
				System.out.println("Enter value:");
				a[row][col]=input.nextInt();
				
			}

		}
		//  2. print each row and its total.
		for(row=0; row<3; row++)
		{
			int total=0;
			for(col=0; col<3; col++)
			{
				total=total+a[row][col];
				System.out.print(a[row][col]+" ");
								
			}
			System.out.println();
			System.out.println("total of row "+row +" is "+total);
			
		}
	//  3. Find total value of diagonal.
		int total=0;
			for(row=0; row<3; row++)
			{
				
				for(col=0; col<3; col++)
				{
					if (row==col)
					total=total+a[row][col];
					System.out.print(a[row][col]+" ");
									
				}
				System.out.println();
								
			}
			System.out.println("Total of diagonal "+total);
		// 4. print each column and its total.
			for(row=0; row<3; row++)
			{
				int total1=0;
				for(col=0; col<3; col++)
				{
					total1=total1+a[col][row];
					System.out.print(a[col][row]+" ");
									
				}
				System.out.println();
				System.out.println("total of column "+col +" is "+total1);
				
			}
			System.out.println(a.length);
			System.out.println(a[0].length);
		}

}
