package Self;

import java.util.Scanner;

public class Max_sum_subarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=2;
		countSubarray(arr, k);
	}
	private static void countSubarray(int[] arr,int k) {
		int sum=0;
		int ans=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		ans=sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			ans=Math.max(ans,sum);
		}
		System.out.println(ans);
	}

}
