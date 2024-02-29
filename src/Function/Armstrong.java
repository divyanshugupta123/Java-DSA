package Function;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		for(int i=101;i<=999;i++) {
			if(isArmstrong(i))
			System.out.println(i+" ");
		}
	}
	static boolean isArmstrong(int n) {
		int x=n;
		int d=0;
		while(n>0) {
			d++;
			n/=10;
		}
		int s=0;
		int dup=x;
		while(x>0) {
			s=(int) (s+Math.pow(x%10,d));
			x/=10;
		}

		if(dup==s) {
			return true;
		}
		else
			return false;
	}
}

