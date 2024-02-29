package Self;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		int row=1;
		int star=n;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("*"+" ");
				j++;
			}
			space+=2;
			star-=1;
			row++;
			System.out.println();
		}
	}

}
