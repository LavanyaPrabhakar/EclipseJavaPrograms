package arrayprograms;

public class ArrayTranspose {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int row=0;
		int col=0;
		int value=1;
		//Input matrix
		System.out.println("print Input matrix:");
		for(row=0; row<3; row++)
		{
			for(col=0; col<3; col++)
			{
				a[row][col]=value;
				System.out.print(value+"  ");
				value++;
			}
			System.out.println();
		}
		//Transpose matrix
				System.out.println("print Transpose matrix:");
				for(row=0; row<3; row++)
				{
					for(col=0; col<3; col++)
					{
						
						System.out.print(a[col][row]+"  ");
						
					}
					System.out.println();
				}

	}

}
