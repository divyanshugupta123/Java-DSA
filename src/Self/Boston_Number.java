package Self;

import java.util.Scanner;

public class Boston_Number {
// Boston Number : sum of its digit is equal to the sum of its prime factors digits
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int sum1=sumDigit(n);
		int sum2=sumPrimefactor(x);
		if(sum1==sum2)
			System.out.println("Boston Number");
		else
			System.out.println("Not a Boston Number");
	}
	private static int sumDigit(int num) {
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	private static int sumPrimefactor(int num){
		int sum=0;
		for(int i=2;i<=num;i++) {
			while(num%i==0) {
				sum+=sumDigit(i);
				num/=i;
				System.out.print(i+" ");
			}
		}
		return sum;
	}
}
