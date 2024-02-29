package recursion_self;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
	private static int fact(int n) {
		if(n==0)
			return 1;
		int fa=fact(n-1);
		int a=n*fa;
		return a;
	}
}