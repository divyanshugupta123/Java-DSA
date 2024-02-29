package Self;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		if(n==p) {
		int[][] m1=new int[m][n];
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[0].length;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		
		int[][] m2=new int[p][q];
		for(int i=0;i<m2.length;i++) {
			for(int j=0;j<m2[0].length;j++) {
				m2[i][j]=sc.nextInt();
			}
		}
		int[][] c=new int[m1.length][m2[0].length];
		
			for(int i=0;i<m1.length;i++) {
				for(int j=0;j<m2[0].length;j++) {
					c[i][j]=0;
					for(int k=0;k<m2.length;k++) {
						c[i][j]=c[i][j]+m1[i][k]*m2[k][j];
					}
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Multiplication is not valid");
		}
	}

}
