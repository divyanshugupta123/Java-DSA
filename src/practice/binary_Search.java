package practice;

import java.util.Scanner;

public class binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr= {2,5,8,9,12,14,15,16,17};
		int k = sc.nextInt();
		System.out.println(search(arr, k));
	}
	private static int search(int[] arr,int ele) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int middle = (low+high)/2;
			if(arr[middle]==ele) {
				return middle;
			}
			else if(arr[middle]>ele) {
				high = middle-1;
			}
			else {
				low = middle+1;
			}
		}
		return -1;
	}

}
