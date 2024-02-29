package DP;

public class _13_minimum_falling_path_sum {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[][] grid = {{2,1,3},{6,5,4},{7,8,9}};
//		int ans = Integer.MAX_VALUE;
//		for(int i = 0;i<grid[0].length;i++) {
//			ans = Math.min(ans, minfallsum(grid, 0, i));
//		}
//		System.out.println(ans);
//	}
//	public static int minfallsum(int[][] arr,int cr,int cc) {
//		if(cr >= arr.length || cc<0 ||cc >=arr[0].length) {
//			return Integer.MAX_VALUE;
//		}
//		if(cr == arr.length -1 ) {
//			return arr[cr][cc];
//		}
//		int leftdia = minfallsum(arr, cr+1, cc-1);
//		int down = minfallsum(arr, cr+1, cc);
//		int rightdia = minfallsum(arr, cr+1, cc+1);
//		return Math.min(leftdia, Math.min(rightdia, down)) + arr[cr][cc];
//	}
	
//	public static void main(String[] args) {
//	    int[][] grid = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
//	    int ans = Integer.MAX_VALUE;
//	    int[][] memo = new int[grid.length][grid[0].length];
//	    
//	    for (int i = 0; i < grid[0].length; i++) {
//	        ans = Math.min(ans, minFallSumDP(grid, 0, i, memo));
//	    }
//	    
//	    System.out.println(ans);
//	}
//
//	public static int minFallSumDP(int[][] arr, int cr, int cc, int[][] memo) {
//	    if (cr >= arr.length || cc < 0 || cc >= arr[0].length) {
//	        return Integer.MAX_VALUE;
//	    }
//	    if (cr == arr.length - 1) {
//	        return arr[cr][cc];
//	    }
//	    
//	    if (memo[cr][cc] != 0) {
//	        return memo[cr][cc];
//	    }
//	    
//	    int leftDia = minFallSumDP(arr, cr + 1, cc - 1, memo);
//	    int down = minFallSumDP(arr, cr + 1, cc, memo);
//	    int rightDia = minFallSumDP(arr, cr + 1, cc + 1, memo);
//	    
//	    memo[cr][cc] = Math.min(leftDia, Math.min(rightDia, down)) + arr[cr][cc];
//	    
//	    return memo[cr][cc];
//	}
	
	public static void main(String[] args) {
	    int[][] grid = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
	    int ans = minFallSumDP(grid);
	    System.out.println(ans);
	}

	public static int minFallSumDP(int[][] arr) {
	    int n = arr.length;
	    int m = arr[0].length;
	    int[][] dp = new int[n][m];

	    // Initialize the DP table with the last row of the grid
	    for (int i = 0; i < m; i++) {
	        dp[n - 1][i] = arr[n - 1][i];
	    }

	    // Start DP from the second last row and move upwards
	    for (int row = n - 2; row >= 0; row--) {
	        for (int col = 0; col < m; col++) {
	            int leftDia = (col > 0) ? dp[row + 1][col - 1] : Integer.MAX_VALUE;
	            int down = dp[row + 1][col];
	            int rightDia = (col < m - 1) ? dp[row + 1][col + 1] : Integer.MAX_VALUE;
	            dp[row][col] = arr[row][col] + Math.min(leftDia, Math.min(rightDia, down));
	        }
	    }

	    // Find the minimum falling path sum in the first row (top row)
	    int ans = Integer.MAX_VALUE;
	    for (int i = 0; i < m; i++) {
	        ans = Math.min(ans, dp[0][i]);
	    }

	    return ans;
	}



}
