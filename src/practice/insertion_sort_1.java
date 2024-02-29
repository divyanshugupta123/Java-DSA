package practice;

import java.util.Scanner;

public class insertion_sort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		insertsort(arr);
	}
	private static void insertsort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int item=arr[i];
			while(arr[j]>arr[i]) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;
		}
		display(arr);
	}
	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
