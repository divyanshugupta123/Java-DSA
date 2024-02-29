package Lec9;

import java.util.Scanner;

public class Row_Zig_Zag {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr= new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("After Zig-Zag");
		for(int row=0;row<arr.length;row++) {
			if(row%2==0) {
				for(int col=0;col<arr[0].length;col++) {
					System.out.print(arr[row][col]+"\t");
				}
			}
			else {
				for(int col=arr[0].length-1;col>=0;col--) {
					System.out.print(arr[row][col]+"\t");
				}
			}
			System.out.println();
		}
	}
}
