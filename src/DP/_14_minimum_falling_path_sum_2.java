package DP;

public class _14_minimum_falling_path_sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{2,1,3},{6,5,4},{7,8,9}};
		int ans = Integer.MAX_VALUE;
		for(int i = 0;i<grid[0].length;i++) {
			ans = Math.min(ans, minfallsum(grid, 0, i));
		}
		System.out.println(ans);
	}
	private static int minfallsum(int[][] arr,int cr,int cc) {
		if(cr == arr.length -1 ) {
			return arr[cr][cc];
		}
		int ans  = Integer.MAX_VALUE;
		for(int i = 0;i< arr.length;i++ ) {
			if(i != cc) {
				ans = Math.min(ans, minfallsum(arr, cr+1, i));
			}
		}
		return ans+arr[cr][cc];
	}

}
