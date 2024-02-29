package Lec6;

import java.util.Arrays;
import java.util.Scanner;

public class Range_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the range from where to where you want to reverse an array");
		int i=sc.nextInt();
		int j=sc.nextInt();
		
		System.out.println(Arrays.toString(rangeReverse(a,i,j)));
	}
	public static int[] rangeReverse(int arr[],int i,int j) {
			while(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			return arr;
	}
}

