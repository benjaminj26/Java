package Lab21;

import java.util.Scanner;

public class MatMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row1,col1;
		System.out.print("Enter the number of rows of first matrix: ");
		row1 = sc.nextInt();
		System.out.print("Enter the number of columns first matrix: ");
		col1 = sc.nextInt();
		int[][] matrix1 = new int[row1][col1];
		System.out.println("Enter "+(row1*col1)+" elements of the first matrix:");
		matrix1 = MatrixInput(row1,col1,matrix1);
		int row2,col2;
		System.out.print("Enter the number of rows of second matrix: ");
		row2 = sc.nextInt();
		System.out.print("Enter the number of columns second matrix: ");
		col2 = sc.nextInt();
		System.out.println("Enter "+(row2*col2)+" elements of the second matrix:");
		int [][] matrix2 = new int[row2][col2];
		matrix2 = MatrixInput(row2,col2,matrix2);
		if(col1 == row2)
		{
			int[][] matrix3 = new int[row1][col2];
			for(int i=0; i<row1; ++i)
			{
				for(int j=0; j<col2; ++j)
				{
					for(int k=0; k<col1; ++k)
					{
						matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
			System.out.println("The sum of the two matrices is:");
			MatrixDisplay(row1,col2,matrix3);
		}
		sc.close();
	}
	
	public static int[][] MatrixInput(int row, int col, int[][] mat)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<row; ++i)
		{
			for(int j=0; j<col; ++j)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
	}
	public static void MatrixDisplay(int row, int col, int[][] mat)
	{
		for(int i=0; i<row; ++i)
		{
			for(int j=0; j<col; ++j)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
