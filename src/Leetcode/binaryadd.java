package Leetcode;

public class binaryadd {

	public static void main(String[] args) {
		String a="11";
		String b="1";
		System.out.println(add(a,b));
	}
	private static String add(String a,String b) {
		long num1=Long.parseLong(a);
		long num2=Long.parseLong(b);
		long ans=binaryToDecimal(num1)+binaryToDecimal(num2);
		long ans1=decimalToBinary(ans);
		String s=String.valueOf(ans1);
		return s;
	}
	private static long binaryToDecimal(long num) {
		long r=0;
		long p=1;
		long sum=0;
		while(num!=0) {
			r=num%10;
			sum=sum+r*p;
			p=p*2;
			num/=10;
		}
		return sum;
	}
	private static long decimalToBinary(long num) {
		long r=0;
		long p=1;
		long sum=0;
		while(num!=0) {
			r=num%2;
			sum=sum+r*p;
			p=p*10;
			num/=2;
		}
		return sum;
	}

}
