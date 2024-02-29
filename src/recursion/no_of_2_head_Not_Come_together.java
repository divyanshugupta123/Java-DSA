package recursion;

public class no_of_2_head_Not_Come_together {

	public static void main(String[] args) {
		int n=2;
		System.out.println(print(0, n, ""));
		

	}
	private static int print(int i,int n,String ans) {
		if(i==n) {
//			System.out.println(ans);
			return 1;
		}
		int a =0;
		if(i==0 || (i>=1 && ans.charAt(i-1)!='H')){
			a+=print(i+1,n,ans+"H");
		}
		
			a+=print(i+1,n,ans+"T");
		return a;
	}

}

