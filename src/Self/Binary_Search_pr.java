package Self;

import java.util.Scanner;

public class Binary_Search_pr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++ ) {
			arr[i]=sc.nextInt();
		}
		int tar=sc.nextInt();
		System.out.println(binarySearch(arr, tar));
	}
	private static int binarySearch(int[] arr,int ele) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+((high-low)/2);
			if(arr[mid]==ele) {
				return mid;
			}
			else if(arr[mid]<ele) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}

}
