package Leetcode;

public class const_small_num_from_2375 {

	public static void main(String[] args) {
		String str="DDIIIDD";
		smallestNumber(str);
	}
	private static void smallestNumber(String str) {
		int[] ans=new int[str.length()+1];
		int c=1;
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i)=='I') {
				ans[i]=c;
				c++;
				for(int j=i-1;j>=0 && str.charAt(j)!='I' ;j--) {
					ans[j]=c;
					c++;
				}
			}
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]);
		}
	}

}
