package Lec6;

import java.util.Scanner;

public class Array_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Max(arr));
	}
	public static int Max(int a[]) {
		int ans =a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>ans) {
				ans=a[i];
			}
		}
		return ans;
	}

}
