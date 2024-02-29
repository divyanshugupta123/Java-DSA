package Lec3;

import java.util.Scanner;

public class Data_type {
	public static void main(String[] args) {
		byte d=(byte)(128);
//		System.out.println(d);
		
		int c=90;
		long l=100_000_000; //literal value or hardcore value
		
		double x=8.9;
		
//		we can't initiailise float directly coz it defaultly takes the literal value as double so we've to typecast it
		float y=9.2f;
		
		Scanner sc =new Scanner(System.in);
		char ch=sc.next().trim().charAt(0);
		System.out.println((int)(ch));
		ch++;
		System.out.println(ch);
		byte by=(byte)(128);
		System.out.println(by);
		
	}
}
