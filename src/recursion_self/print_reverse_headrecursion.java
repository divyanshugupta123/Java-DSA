package recursion_self;

import java.util.Scanner;

public class print_reverse_headrecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
	}
	private static void print(int n) {
		if(n==0)
			return;
		print(n);
		System.out.println(n-1);
	}
}
