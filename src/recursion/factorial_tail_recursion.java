package recursion;

public class factorial_tail_recursion {

	public static void main(String[] args) {
		int n=5;
		int ans=1;
		System.out.print(fact(n,ans));
	}
	private static int fact(int n,int ans) {
		if(n==0) {
			return ans;
		}
		return fact(n-1,ans*n);
	} 
}
 