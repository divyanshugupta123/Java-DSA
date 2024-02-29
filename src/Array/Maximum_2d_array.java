package Array;
import java.util.*;
public class Maximum_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int ans=max(arr);
		System.out.println(ans);
		
	}
	static int max(int a[][]) {
		int ans=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>ans) {
					ans=a[i][j];
				}
			}
	}
		return ans;
}
}
