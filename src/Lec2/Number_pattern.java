package Lec2;

import java.util.Scanner;

public class Number_pattern
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			int val=1;
			while (j <= star) {
				System.out.print(val+" ");
				j++;
				val++;
			}

			space--;
			star += 2;
			System.out.println();
			row++;

		}

	}

}
