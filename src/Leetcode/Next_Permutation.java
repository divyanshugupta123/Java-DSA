package Leetcode;

import java.util.*;

public class Next_Permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int m=sc.nextInt();
			int[] arr=new int[m];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			nextPermutation(arr);
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
//			nextPermutation(arr);	
		}
	}
	private static void nextPermutation(int[] arr) {
		int p=-1;
		int q=-1;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		if(p==-1) {
			rangeReverse(arr, 0, arr.length-1);
			return;
		}
		for(int i=arr.length-1;i>p;i--) {
			if(arr[i]>arr[p]) {
				q=i;
				break;
			}
		}
		int temp=arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		rangeReverse(arr, p+1, arr.length-1);
		
		
	}
	private static void rangeReverse(int[] arr,int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		} 
	}

}
