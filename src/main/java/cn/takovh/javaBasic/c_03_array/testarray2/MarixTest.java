package cn.takovh.javaBasic.c_03_array.testarray2;

public class MarixTest {
	public static void printMatrix(int [][] c) {
		for(int i = 0;i<c.length;i++) {
			for(int j = 0;j<c[i].length;j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	public static int[][] addMatrix(int a[][],int b[][]){
		int [][] c = new int[a.length][a.length];
		for(int i = 0;i<c.length;i++) {
			for(int j = 0;j<c[i].length;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	public static void main(String[] args) {
		int [][] a = {
						{1,3},
							{2,4}
					};
		int [][] b = {
						{3,4},
						{5,6}
					};
		int [][] c = addMatrix(a,b);
		printMatrix(c);
	}
}
