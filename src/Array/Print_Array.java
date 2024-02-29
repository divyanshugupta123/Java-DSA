package Array;
import java.util.*;

public class Print_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		}
			System.out.print(Arrays.toString(a));
		}
		
	}
