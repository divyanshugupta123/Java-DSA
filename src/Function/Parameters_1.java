package Function;
import java.util.*;

public class Parameters_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=sum(a,b);
		System.out.println(ans);
	}
	static int sum(int n,int m) {
		return (m+n);
	}
}
