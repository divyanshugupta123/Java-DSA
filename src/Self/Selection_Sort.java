package Self;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		selectionSort(arr);
		System.out.println("\nAfter Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int idx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[idx]) {
					idx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
	}

}
