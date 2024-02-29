package recursion;
import java.util.*;
public class prime_seieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPrime_prime_seieve_complexity_nloglogn(100);
	}
	private static boolean isPrime_complexity_root_n(int n){
		if(n<=1) {
			return false;
		}
	    for(int i=2;i<=Math.sqrt(n);i++){
	        if(n%i!=0){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	    return false;
	}
	private static void isPrime_prime_seieve_complexity_nloglogn(int n) { // print all prime numbers upto n so from 0 to n there is n+1 element
		boolean[] prime = new boolean[n+1];
		// default value of this array prime is false that is prime and true that is not prime 
		prime[0]=true;
		prime[1]=true;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(prime[i]==false) { //agar vo prime hua to uske sare multiple not prime honge kyuki factor ban jaega
				for(int j=2;j*i<=n;j++) {
					prime[j*i]=true;
				}
				
			}
		}
		for(int i=0;i<n;i++) {
			if(prime[i]==false) {
				System.out.print(i+" ");
			}
			
		}
	}
}
