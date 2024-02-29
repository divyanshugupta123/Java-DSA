package DP;

import java.util.Arrays;

public class _1_fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] dp= new int[n+1];
		System.out.println(fiboTD(n,dp));
		System.out.println(fibo(n));
		System.out.println(fiboBU(n));
		
	}
	
	
	
//	top down approach
	
	public static int fiboTD(int n,int[] dp) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];	// agar present hoga to return kr denge 
		}
		int f1 = fiboTD(n-1,dp);
		int f2 = fiboTD(n-2,dp);
		return dp[n] = f1 + f2;			// yaad kr lenge array m agar repeat hua to return kar denge
	}

	
//	BOTTOM UP : MOST EFFICINET 
	public static int fiboBU(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2;i<dp.length;i++) {
			dp[i] = dp[i-1] + dp[i-2];
			
		}
		return dp[n];
	}
	
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int f1 = fibo(n-1);
		int f2 = fibo(n-2);
		return  f1 + f2;		
	}
}
