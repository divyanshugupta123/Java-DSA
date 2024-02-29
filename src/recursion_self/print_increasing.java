package recursion_self;

public class print_increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print(n);	
	}
	private static void print(int n) {
		if(n==0)
			return;
		print(n-1);
		System.out.println(n);
	}
}