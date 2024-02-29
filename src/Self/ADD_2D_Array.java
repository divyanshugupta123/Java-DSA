package Self;

import java.util.Scanner;

public class ADD_2D_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		int[][] m1=new int[m][n];
		int[][] m2=new int[p][q];
		if(m==p && n==q) {
			for(int i=0;i<m1.length;i++) {
				for(int j=0;j<m1[0].length;j++) {
					m1[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<m2.length;i++) {
				for(int j=0;j<m2[0].length;j++) {
					m2[i][j]=sc.nextInt();
				}
			}
			System.out.println("___________INTPUT MATRIXES ARE : __________");
			for(int i=0;i<m1.length;i++) {
				for(int j=0;j<m1[0].length;j++) {
					System.out.print(m1[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println();
			for(int i=0;i<m1.length;i++) {
				for(int j=0;j<m1[0].length;j++) {
					System.out.print(m2[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("After Adding both");
			sumMatrix(m1,m2);
		}
		else {
			System.out.println("Sum is not possible because the order of the matrixes are not same");
		}
	}
	private static void sumMatrix(int[][] max1,int[][] max2) {
		int[][] sum=new int[max1.length][max1[0].length];
		for(int i=0;i<max1.length;i++) {
			for(int j=0;j<max1[0].length;j++) {
				sum[i][j]=max1[i][j]+max2[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
