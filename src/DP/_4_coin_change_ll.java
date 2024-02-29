package DP;

import java.util.Arrays;

public class _4_coin_change_ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1,2,5};
		int amount = 5;
		int[][] dp = new int[amount+1][coin.length];
		Arrays.fill(dp, -1);
		System.out.println(coinChange(coin, amount, 0, dp));
		
	}
	private static int coinChangeBU(int[] coin,int amount) {
		int[][] dp = new int[amount+1][coin.length+1];
		for(int i = 0 ; i<dp[0].length;i++) {
			dp[0][i] = 1;
			
		}
		for(int am = 1;am<dp.length;am++) {
			for(int i =1;i<dp[0].length;i++) {
				int include = 0,exclude = 0;
				if(am >= coin[i-1]) {
					include = dp[am-coin[i-1]][i];
					
					
				}
				exclude = dp[am][i-1];
				dp[amount][i] = include + exclude;
			}
			
		}
		return dp[dp.length-1][dp[0].length-1];
	}
	private static int coinChange(int[] coin,int amount,int i,int[][] dp) {
		if(amount == 0) {
			return 1;
			
		}
		if(i == coin.length){
			return 0;
		}
		if(dp[amount][i]!=-1) {
			return dp[amount][i];
		}
			
		int include = 0,exclude = 0;
		if(amount >= coin[i]) {
			include = coinChange(coin, amount-coin[i], i,dp);
			
		}
		exclude = coinChange(coin, amount, i+1,dp);
		return dp[amount][i] = include + exclude;
	}

}
