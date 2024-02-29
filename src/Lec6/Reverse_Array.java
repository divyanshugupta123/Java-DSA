package Lec6;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(reverseArray(a)));
	}
	public static int[] reverseArray(int arr[]) {
		int length=arr.length;
		for(int i=0;i<=arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[length-i-1];
			arr[length-i-1]=temp;
		}
		return arr;
	}

}
