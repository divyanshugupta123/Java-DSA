package Leetcode;

import java.util.Scanner;

public class kth_root {

	public static void main(String[] args) {
		
//		find the maximum value of x for given n and k i.e. x^k<=n
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(kthRoot(n, k));
	}
	private static int kthRoot(int n,int k) {
		int lo=1;
		int high=n;
		int ans=0;
		while(lo<=high) {
			int mid=lo+(high-lo)/2;
			if(Math.pow(mid,k)<=n) {
				ans=mid;
				lo=mid+1; //we want maximise solution so we change low and for minimise soln we change high=mid-1;
			}
			else {
				high=mid-1;
			}
			
		}
		return ans;
	}

}
