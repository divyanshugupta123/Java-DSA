package Self;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt(),x=m,c=0,s=0;
		while(m>0) {
			c++;
			m/=10;
		}
		int dup=x;
		while(x>0) {
			s+=Math.pow(x%10,c);
			x/=10;
		}
		if(dup==s) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not an Armstrong");
		}
	}

}
