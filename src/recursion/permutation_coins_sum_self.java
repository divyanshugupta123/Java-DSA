package recursion;

public class permutation_coins_sum_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=10;
		printCoins(n,0,"");
	}
	private static void printCoins(int n,int sum,String ans) {
		if(sum>n) {
			return;
		}
		if(sum==n) {
			System.out.println(ans);
			return;
		}
		printCoins(n, sum+2, ans+'2');
		printCoins(n, sum+3, ans+'3');
		printCoins(n, sum+5, ans+'5');
	}

}