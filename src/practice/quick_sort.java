package practice;

import java.util.Scanner;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		quicksort(arr,0,arr.length-1);
	}
	private static void quicksort(int[] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		int idx = partition(arr, low, high);
		quicksort(arr,low,idx-1);
		quicksort(arr,idx+1,high);
		display(arr);
	}
	private static int partition(int[] arr,int low,int high) {
		int pivot = arr[high];
		int idx = low;
		for(int i=low;i<high;i++) {
			if(arr[i]<pivot) {
				int temp = arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				idx++;
			}
			
		}
		return idx;
	}
	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
