package Leetcode;

import java.util.Scanner;

public class plusone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		plusOne(arr);
	}
	private static void plusOne(int[] arr) {
		String s="";
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				s=s+arr[i]+1;
			}
			else {
				s+=arr[i];
			}
		}
		System.out.println(s);
	}
}
