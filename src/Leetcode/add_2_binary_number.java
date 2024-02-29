package Leetcode;

import java.util.Scanner;

public class add_2_binary_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int ans=binaryToDecimal(num1)+binaryToDecimal(num2);
		int ans1=decimalToBinary(ans);
		String s=String.valueOf(ans1);
		System.out.println(s);
	}
	
	private static int binaryToDecimal(int num) {
		int r=0;
		int p=1;
		int sum=0;
		while(num!=0) {
			r=num%10;
			sum=sum+r*p;
			p=p*2;
			num/=10;
		}
		return sum;
	}
	private static int decimalToBinary(int num) {
		int r=0;
		int p=1;
		int sum=0;
		while(num!=0) {
			r=num%2;
			sum=sum+r*p;
			p=p*10;
			num/=2;
		}
		return sum;
	}

}
