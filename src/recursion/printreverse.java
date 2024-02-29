package recursion;

public class printreverse {

	public static void main(String[] args) {
		int n=5;
		print(n);
	}
	private static void print(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);   //self work
		print(n-1);  //stack pointer
	}
}