package DP;

import java.util.Arrays;

import Assignment.Array;

public class _11_LIS_300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private static int maxLongestSub(int [] arr) {
		int[] dp = new int[arr.length];
		Arrays.fill(arr, 1);
		for(int i = 1;i<dp.length;i++) {
			for(int j = i-1;j>=0;j++) {
				if(arr[j]<arr[i]) {
					int a = dp[j]+1;
					dp[i] = Math.max(dp[i], a);
				}
			}
		}
		int max = dp[0];
		for(int i = 1;i<dp.length;i++) {
			if(max<dp[i]) {
				max = dp[i];
				
			}
		}
		return max;
	}

}
