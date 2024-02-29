package DP;

public class _3_min_climbing_stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,100,1,1,1,100,1,1,100,1};
		
		int zeroth = minCost(arr, 0);
		int first = minCost(arr, 1);
		System.out.println(Math.min(zeroth, first));

	}
	public static int minCost(int[] arr,int i) {
		if(i >= arr.length) {
			return 0;
		}
		int first = minCost(arr, i+1);
		int second = minCost(arr, i+2);
		return Math.min(first, second) + arr[i];
	}
}
