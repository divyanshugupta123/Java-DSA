package DP;

public class _6_knapsack_zero_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] weight = {1,2,3,2,2};
		int[] val = {8,4,0,5,3};
		int cap = 4;
		System.out.println(knapsack(weight, val, cap, 0));
		
	}
	public static int knapsack(int[] wt,int[] val,int cap,int i) {
		if(i == wt.length || cap == 0) {
			return 0;
		}
		
		int inclusive = 0, exclusive = 0;
		if(cap >= wt[i]) {
			inclusive = val[i] + knapsack(wt,val,cap-wt[i],i+1);
		}
		exclusive = knapsack(wt, val, cap, i+1);
		return Math.max(inclusive, exclusive);
		
	}

}
