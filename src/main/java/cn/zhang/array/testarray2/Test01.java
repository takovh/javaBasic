package cn.zhang.array.testarray2;

public class Test01 {
	public static void main(String[] args) {
		int [][] a = {
						{1,2},
						{3,4,0,9},
						{5,6,7}
					 };
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
