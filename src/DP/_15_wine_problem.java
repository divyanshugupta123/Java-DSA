package DP;

public class _15_wine_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = {2,3,5,1,4};
		System.out.println(wine(wine,0,wine.length-1,1));
		System.out.println(wine1(wine));
	}
	
	
//	normal recursion 
	
	
	private static int wine(int[] wine,int i,int j,int years) {
		if(i>j) {
			return 0;
		}
		int first = wine[i] * years + wine(wine, i+1, j, years+1);
		int last = wine[j] * years + wine(wine, i, j-1, years+1);
		
		return Math.max(first, last);
	}

	
//	bottom up approach 
	
	
	private static int wine1(int[]wi) {
		int year = wi.length;
		int[][] dp = new int[wi.length][wi.length];
		for(int i = 0;i<dp.length;i++) {
			
			dp[i][i] = wi[i]*year;
			
		}
		year--;
		for(int slide = 1;slide<dp.length;slide++) {
			for(int j = slide;j<dp.length;j++) {
				int i = j - slide;
				int first = wi[i] * year + dp[i+1][j];
				int last = wi[j] * year + dp[i][j-1];
				dp[i][j] = Math.max(first, last);
				
			}
			year--;
		}
		return dp[0][dp.length-1];
	}
	
}
