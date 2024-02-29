package Lec39;

public class prime_prime_till_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=85;
		System.out.println(isPrime(n));
	}
	private static boolean isPrime(int n) {
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
