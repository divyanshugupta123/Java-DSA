package Array;
import java.util.*;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
public class Linear_Search_2D_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int target=sc.nextInt();
		int[] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));
	}
	static int[] search(int a[][],int target) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}

}
