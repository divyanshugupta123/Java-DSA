package practice;

import java.util.Scanner;

public class selection_sort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		selsort(arr);
	}
	private static void selsort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int a = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[a]>arr[j]) {
					a=j;
				}
			}
//			swap(arr[i],arr[a]);
			int temp = arr[i];
			arr[i]=arr[a];
			arr[a]=temp;
		}
		display(arr);
	}
	private static void swap(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
	}
	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
