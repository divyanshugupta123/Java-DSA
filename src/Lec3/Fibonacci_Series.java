package Lec3;
import java.util.*;
public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int a=0;
		int b=1;
		while(i<=n) {
			int c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println(a);
	}
}