package DP;

public class _9_edit_distancce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "FOOD";
		String s2 = "MONEY";
		System.out.println(editDistance(s1, s2, 0, 0));
		
	}
	private static int editDistance(String s1 , String s2 ,int i ,int j) {
		
		if(i == s1.length()) {
			return s2.length() - j;
		}
		
		if(j == s2.length()) {
			return s1.length() - i;
		}
		
		int ans = 0;
		if(s1.charAt(i) == s2.charAt(j)) {
			ans = editDistance(s1, s2, i+1, j+1);
			
		}
		else {
			int delt = editDistance(s1, s2, i+1, j);
			int repl = editDistance(s1, s2, i+1, j+1);
			int inset = editDistance(s1, s2, i, j+1);
			
			ans = Math.min(inset, Math.min(repl, delt))+1;
		}
		return ans;
	}
	private static int editDistance(String s1, String s2) {
	    int m = s1.length();
	    int n = s2.length();
	    int[][] dp = new int[m + 1][n + 1];

	    // Initialize the DP table
	    for (int i = 0; i <= m; i++) {
	        for (int j = 0; j <= n; j++) {
	            if (i == 0) {
	                dp[i][j] = j;
	            } else if (j == 0) {
	                dp[i][j] = i;
	            } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
	                dp[i][j] = dp[i - 1][j - 1];
	            } else {
	                int insert = dp[i][j - 1];
	                int delete = dp[i - 1][j];
	                int replace = dp[i - 1][j - 1];
	                dp[i][j] = 1 + Math.min(Math.min(insert, delete), replace);
	            }
	        }
	    }

	    return dp[m][n];
	}

}
