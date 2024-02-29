package recursion;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(n));
	}
	private static int fact(int n) {
		//base case
		if(n==0) {
			return 1;
		}
		int fn=fact(n-1);	// stack pointer
		return fn*n;
	}

}
