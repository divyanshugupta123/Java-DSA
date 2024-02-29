//BASE 10 TO BASE 6

package Lec3;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=1;
		int s=0;
		while(n>0) {
			s=s+p*(n%6);
			p*=10;
			n/=6;
		}
		System.out.println(s);
	}

}
