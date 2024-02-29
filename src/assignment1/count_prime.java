package assignment1;

import java.util.Scanner;

public class count_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		countprime(m,n);
	}
	private static void countprime(int m,int n) {
		int count=0;
		while(m<=n) {
			int c=0;
			for(int i=1;i<=m;i++) {
				if(m%i==0)
					c++;
			}
			if(c==2)
				count++;
			m++;
		}
		System.out.println(count);
	}
}
