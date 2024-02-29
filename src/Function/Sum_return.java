package Function;
import java.util.*;
public class Sum_return {

	public static void main(String[] args) {
		System.out.println("The sum is "+sum());
	}
	static int sum() {
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		return (m+n);
	}

}
