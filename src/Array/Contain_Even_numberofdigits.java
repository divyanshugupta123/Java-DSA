package Array;
import java.util.*;
public class Contain_Even_numberofdigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(ans(a));
	}
	static int ans(int arr[]) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
		if(iseven(arr[i]))
			c++;
		}
		return c;
	}
	static int numofdig(int num) {
		int d=0;
		while(num>0) {
			num/=10;
			d++;
		}
		return d;
	}
	static boolean iseven(int num) {
		int values=numofdig(num);
		if(values%2==0) {
			return true;
		}
		return false;
	}
	
}
