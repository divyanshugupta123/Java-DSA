package Self;

import java.util.Scanner;

public class Max_Sum_of_subArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		maxSum(arr, k);
	}
	private static void maxSum(int[] arr,int k) {
		int max=0;
		int ans=0;
		for(int i=0;i<k;i++) {
			ans+=arr[i];
		}
		max=ans;
		for(int i=k;i<arr.length;i++) {
			ans=ans+arr[i];
			ans=ans-arr[i-k];
			max=Math.max(ans, max);
		}
		System.out.println(max);
	}
}
