package Lec3;
import java.util.*;
public class HCF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int dividend=sc.nextInt();
		while(dividend%divisor!=0) {
			int rem=dividend%divisor;
			dividend=divisor;
			divisor=rem;
		}
		System.out.println(divisor);
	}
}
