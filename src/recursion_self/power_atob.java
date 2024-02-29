package recursion_self;

public class power_atob {

	public static void main(String[] args) {
		long a=2;
		long b=10;
		System.out.println(pow(a, b));
	}
	private static long pow(long a,long b) {
		if(b==0) {
			return 1;
		}
		long an=pow(a,b-1);
		return an*a;
	}

}
