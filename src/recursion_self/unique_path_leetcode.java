package recursion_self;

public class unique_path_leetcode {

	public static void main(String[] args) {
		int m=3;
		int n=3;
		System.out.println(printPath(0,0, m, n,""));
	}
	private static int printPath(int cr,int cc,int m,int n,String str) {
		if(cr>=m || cc>=n) {
			return 0;
		}
		if(cr==m-1 && cc==n-1) {
			System.out.println(str);
			return 1;
		}
		int a=printPath(cr+1,cc,m,n,str+'V');
		int b=printPath(cr, cc+1, m, n, str+'H');
		return a+b;
	}
}
