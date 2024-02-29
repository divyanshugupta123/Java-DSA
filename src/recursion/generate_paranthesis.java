package recursion;

public class generate_paranthesis {

	public static void main(String[] args) {
		int n=3;
		generateParanthesis(n, 0, 0, "");
	}
	private static void generateParanthesis(int n,int opening,int closing,String str) {
		if(opening==n && closing==n) {
			System.out.println(str);
			return;
		}
		if(opening<n) {
		generateParanthesis(n, opening+1, closing, str+"(");
		}
		if(closing<opening) {
		generateParanthesis(n, opening, closing+1, str+")");
		}
	}

}
