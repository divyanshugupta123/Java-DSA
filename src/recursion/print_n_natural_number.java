package recursion;

import java.util.Scanner;

public class print_n_natural_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=1;
		printnantu(a);
	}
	private static void printnantu(int a) {
		if(a<=5) {
			System.out.println(a);
			printnantu(a+1);
		}
	}
}
