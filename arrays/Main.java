package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows and colums");
		int [] rc=new int[2]; //1D array
		for(int i=0;i<2;i++) {
			rc[i]=sc.nextInt();
		}
		int rows=rc[0];
		int columns=rc[1];
		int[][] m1= new int[rows][columns]; //2d Arrays
		int[][] m2= new int[rows][columns];
		System.out.println("Enter 1st matrix");
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)		//nested for loops
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2st matrix");
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		
		int c[][]=Matrix.matrixAdd(m1,m2,rows,columns);
		System.out.println("Sum of two matrixs");
		 for(int[] row : c) {   //for each loop
	            for (int column : row) {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
	}



}
class Matrix
{
	public static int[][]  matrixAdd(int a[][],int b[][],int c,int d) {
		int[][] e =new int[c][d];
		for(int i=0;i<c;i++) {
			for(int j=0;j<d;j++) {
				e[i][j]=a[i][j]+b[i][j];
			}
		}
		return e;
	}
}