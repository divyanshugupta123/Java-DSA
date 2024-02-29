package Self;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=2*n-3;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("*"+" ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			i=1;
			while(i<=star) {
				if(row==n && i==star) break;
				System.out.print("*"+" ");
				i++;
			}
			star++;
			space-=2;
//			star++;
			row++;
			System.out.println();
		}
	}

}
