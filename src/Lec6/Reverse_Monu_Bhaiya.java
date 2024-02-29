package Lec6;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Monu_Bhaiya {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(reverseArray(a)));
	}
	public static int[] reverseArray(int arr[]){
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}

}
