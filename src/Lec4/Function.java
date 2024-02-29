package Lec4;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		for(int i=2;i<=n;) {
			if(n%i==0) {
				sum+=sum_digit(i);
				n/=i;
				continue;
			}
			i++;
		}
		int sum2=sum_digit(temp);
		if(sum2==sum) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		
	}
	static int sum_digit(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+r;
			n/=10;
		}
		return n;
	}

}
