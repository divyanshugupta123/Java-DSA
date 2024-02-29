package hashcode;

public class rabin_karp_pattern {

	
	
	
	private static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static long Pattern(String s, String p){
	        long mod = 100_00_007;
	        long pow = 1;
	        long pr = 31;
	        long hv = 0;
	        for (int i = 0; i < p.length(); i++) {
	            int pos = p.charAt(i) - 'A' + 1;
	            hv = (hv + (pos * pow) % mod) % mod;
	            pow = (pow * pr) % mod;
	        }
	        long [] dp = new long[s.length()];
	        long [] pa = new long[s.length()];
	        dp[0] = s.charAt(0) - 'a' + 1;
	        pa[0] = 1;
	        pow = 31;
	        for (int i = 1; i < s.length(); i++) {
	            dp[i] = (dp[i-1] + ((s.charAt(i) - 'a' + 1) * pow) % mod);
	            pa[i] = pow;
	            pow = (pow * pr) % mod;
	        }
	        return pow;
	    }
	}

