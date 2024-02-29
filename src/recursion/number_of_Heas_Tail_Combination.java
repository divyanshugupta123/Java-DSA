package recursion;

public class number_of_Heas_Tail_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(print(n,""));
	}
	private static int print(int n,String ans) {
		if(n==0) {
//			System.out.println(ans);
			return 1;
		}
		int a=print(n-1,ans+"H");
		int b=print(n-1,ans+"T");
		return a+b;
	}

}
