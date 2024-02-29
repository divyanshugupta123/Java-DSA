package Self;

import java.util.*;

public class Armstrong_Range {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		int m=sc.nextInt(),n=sc.nextInt(),x,c,s,dup;
		for(int i=m;i<=n;i++) {
			c=0;
			x=i;
			s=0;
			while(x>0) {
				c++;
				x/=10;
			}
			dup=i;
			while(dup>0) {
				s+=Math.pow(dup%10,c);
				dup/=10;
			}
			if(i==s)
				System.out.println(s);
		}
		
	}

}
