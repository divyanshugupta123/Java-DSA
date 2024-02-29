package Function;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean ans=isPrime(n);
		System.out.println(ans);
	}
	static boolean isPrime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2)
			return true;
		else
			return false;
	}
}