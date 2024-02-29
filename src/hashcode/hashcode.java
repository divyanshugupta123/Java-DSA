package hashcode;

public class hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "APPLE";
		

	}
	public static long hashcode(String str) {
		long mod = 1000_000_007;
		long pow = 1;
		long p = 31,hv =0;
		for(int i =0 ; i<str.length();i++) {
			int pos = str.charAt(i)-'A' +1 ;
			hv = (hv + (pos*pos)%mod)%mod;
			pow = (pow * p)%mod;
		}
		return hv;
	}
}
