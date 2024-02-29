package DP;

public class _5_DistinctSubsequences {

	public static void main(String[] args) {
		String s1 = "rabbbit";
		String s2 = "rabbit";
		distinctSubsequence(s1, s2, 0, 0);

		
	}
//	
//	s1 --> coin
//	s2 --> amount
//	i --> s1 index
//	j --> s2 index
//	
	public static int distinctSubsequence(String s1 , String s2,int i ,int j) {
		if(j == s2.length()) {
			return 1;
		}
		if(i == s1.length()) {
			return 0;
		}
		int inclusive = 0 , exclusive = 0;
		if(s1.charAt(i) == s2.charAt(j)) {
			inclusive = distinctSubsequence(s1, s2, i+1, j+1);
			
		}
		exclusive = distinctSubsequence(s1, s2, i+1, j);
		return inclusive + exclusive;
		
	}

}
