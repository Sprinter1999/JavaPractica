package Matrix;

import java.util.Scanner;

public class MatrixTest {
	public static void main(String[] args) {
		int m,n;
		System.out.println("Please input the length and width"
				+ ",then there'll be a random matrix");
		Scanner inScanner=new Scanner(System.in);
		m=inScanner.nextInt();
		n=inScanner.nextInt();
		inScanner.close();
		Matrix matrix=new Matrix(m,n);
		matrix.output();
		System.out.println("Transpose one:");
		matrix.transpose().output();
		
	}
}
class Matrix
{
	int array[][];

	public Matrix() {
		array=new int[10][10];
	}
	public Matrix(int n)
	{
		array=new int[n][n];
		int m=n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				array[i][j] = (int) (Math.random() * 10);
		}
	}
	public Matrix(int m,int n)
	{
		array=new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				array[i][j] = (int) (Math.random() * 10);
		}
	}
	public Matrix(int table[][])
	{
		array=table;
	}
	public void output() 
	{// 输出Matrix类中数组的元素值
		System.out.println("Matrix:");
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[0].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
	public Matrix transpose()
	{
		Matrix tran=new Matrix(this.array);
		for (int i = 0; i < tran.array.length; i++) 
		{
			for (int j = i; j < tran.array[0].length; j++)
				{
					int k = tran.array[i][j] ;
					tran.array[i][j] = tran.array[j][i] ;
					tran.array[j][i] = k ;
				}
		}
		
		return tran;
	}
	public boolean isSymmetry() { // 判断一个矩阵是否为对称矩阵
		boolean Symmetry = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array[0].length; j++) {
				if (array[i][j] == array[j][i]) {
					Symmetry = false;
				}
			}
		}
		return Symmetry;
	}
	public boolean isTriangular() {// 判断一个矩阵是否为上三角矩阵
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if ((i > j) && (array[i][j] != 0)) {
					flag = false;
				}
			}
		}
		return flag;
	}
	public void add(Matrix b) 
	{ // 将矩阵b与接受着对象相加，结果放在接受着对象中
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[0].length; j++) 
			{
				this.array[i][j] = array[i][j] + b.array[i][j];
			}
		}
	}
}