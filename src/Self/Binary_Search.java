package Self;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Element on "+(i+1)+" position");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Number of Testcases");
		int testcase=sc.nextInt();
		while(testcase-->0) {
			System.out.println("Enter the Target");
			int tar=sc.nextInt();
			System.out.println(search(arr, tar));
		}
	}
	private static int search(int[] arr,int tar) {
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
