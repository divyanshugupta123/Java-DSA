package recursion;

public class unique_path_leetcode {

	public static void main(String[] args) {
		int n=3;
		int m=3;
		System.out.println(printWays(n, m, 0, 0, ""));
	}
	private static int printWays(int n,int m,int cc,int cr,String str){
		if(cc==m-1 && cr==n-1) {
			System.out.println(str);
			return 1;
		}
		if(cc>=m||cr>=n) {
			return 0;
		}
		int a=printWays(n, m, cc, cr+1,str+'V');
		int b=printWays(n, m, cc+1, cr, str+'H');
		return a+b;
	}

}
