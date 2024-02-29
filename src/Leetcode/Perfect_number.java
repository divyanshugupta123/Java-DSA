package Leetcode;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkPerfectNumber(n));
	}
	 public static boolean checkPerfectNumber(int num) {
		 int sum=0;
		 for(int i=1;i<num;i++) {
			 if(num%i==0) {
				 sum+=i;
				 System.out.println(i);
			 }
		 }
		 if(sum==num) {
			 return true;
		 }
		 return false;
	 }

}
