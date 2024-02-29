package Lec8;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int target=sc.nextInt();
		System.out.println(binarySearch(arr, target));
		
	}
	private static int binarySearch(int arr[] , int tar) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==tar) {
				return mid;
			}
			else if(arr[mid]>tar) {
				high=mid-1;
				
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}

}
