package Leetcode;

import java.util.Scanner;

public class first_non_repeating_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0) {
			String str=sc.next();
			firstchar(str);
		}
	}
	private static void firstchar(String str){
		int[] arr=new int[256];
		int si=0;
		int ei=0;
		while(ei<str.length()) {
			arr[str.charAt(ei)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)]==1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

}
