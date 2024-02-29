package Array;
import java.util.*;
public class Maximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
//      int target=sc.nextInt();
        int ans=min(a);
        System.out.println(ans);
	}
	static int min(int a[]) {
		int ans=a[0];
		for(int i=1;i<a.length;i++) {
			if(ans<a[i]) {
				ans=a[i];
			}
		}
		return ans;
	}
}
