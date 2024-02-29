package recursion;

public class power_a_to_b {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println(power(a,b));
	}
	private static int power(int a,int b) {
		if(b==0) {
			return 1;
		}
		int f=power(a,b-1);
		return a*f;
	}

}
