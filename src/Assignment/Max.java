package Assignment;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(max(a));
	}
	static int max(int arr[]) {
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(ans<arr[i]) {
				ans=arr[i];
			}
		}
		return ans;
	}

}
