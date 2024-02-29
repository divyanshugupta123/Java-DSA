package recursion;

public class no_2_head_consecutive_occurs {

	public static void main(String[] args) {
		int n=3;
		print(0,n,"");

	}
	private static void print(int i,int n,String ans) {
		if(i==n) {
			System.out.println(ans);
			return;
		}
		if(i==0 || (i>=1 && ans.charAt(i-1)!='H')){
			print(i+1,n,ans+"H");
		}
		print(i+1,n,ans+"T");
	}

}
