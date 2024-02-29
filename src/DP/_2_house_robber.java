package DP;

import java.util.Arrays;

public class _2_house_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,7,9,3,1};
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(robber(arr,0,dp));
	}
	
	
	
	
//	public static int robber(int[] arr,int i) {
//		if(i >= arr.length) {
//			return 0;
//		}
//		int rob = arr[i]+robber(arr,i+2);
//		int dont_rob = robber(arr,i+1);
//		return Math.max(rob, dont_rob);
//	}

	public static int robberBU(int[] arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[1], arr[0]);
		for(int i = 2;i<dp.length;i++) {
			int rob = arr[i] + dp[i-2];
			int dont_rub = dp[i-1];
			dp[i] = Math.max(rob, dont_rub);
			
		}
		return dp[dp.length];
		
		
	}
	
	public static int robber(int[] arr,int i,int[] dp) {
		if(i >= arr.length) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i]+robber(arr,i+2,dp);
		int dont_rob = robber(arr,i+1,dp);
		return dp[i] =  Math.max(rob, dont_rob);
	}

}
