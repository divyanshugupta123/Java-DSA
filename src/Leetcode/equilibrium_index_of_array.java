package Leetcode;

import java.util.Scanner;

public class equilibrium_index_of_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		equlibrium_sum(arr);
	}
	private static void equlibrium_sum(int[] arr)
	{
		int i,j;
		for(i=0;i<arr.length;i++) {
			int ls=0;
			int rs=0;
			for(j=0;j<i;j++) {
				ls+=arr[j];
			}
			for(j=i+1;j<arr.length;j++) {
				rs+=arr[j];
			}
			if(ls==rs) {
				System.out.println(i);
			}
			else {
				System.out.println(-1);
				break;
			}
		}
	}

}
