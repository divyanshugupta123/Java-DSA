package Lec3;

import java.util.Scanner;

public class Printing_Fibonacci {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int i=1;
			int a=0;
			int b=1;
			System.out.print(a+" "+b+" ");
			while(i<=n-2) {
				int c=a+b;
				a=b;
				b=c;
				i++;
				System.out.print(c+" ");
				}
			}
}