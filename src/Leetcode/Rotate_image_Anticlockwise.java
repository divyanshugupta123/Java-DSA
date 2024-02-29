package Leetcode;

import java.util.Scanner;

public class Rotate_image_Anticlockwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr);
        for(int i=arr.length-1;i>=0;i--) {
        	for(int j=0;j<arr[0].length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
	}
	private static void transpose(int[][] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
