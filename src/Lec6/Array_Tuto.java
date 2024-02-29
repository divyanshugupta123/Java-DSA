package Lec6;

import java.util.Scanner;

public class Array_Tuto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int tar=sc.nextInt();
		System.out.println(search(arr,tar));
	}
	public static int search(int a[],int target) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
