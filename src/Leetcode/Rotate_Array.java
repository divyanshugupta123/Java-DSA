package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		reversalAlgo(arr,k);
		System.out.println(Arrays.toString(arr));
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
	public static void reversalAlgo(int[] nums, int k) {
		int n=nums.length;
		rangeReverse(nums,0,n-k-1);
		rangeReverse(nums,n-k,n-1);
		rangeReverse(nums,0,n-1);
	}
//	public void rotate(int[] arr,int k) {
//		int n = arr.length;
//		k = k % n;
//		while (k > 0) {
//			int item = arr[n - 1];
//			for (int i = n - 2; i >= 0; i--) {
//				arr[i + 1] = arr[i];
//			}
//			arr[0] = item;
//			k--;
//		}
//	}
		
}
