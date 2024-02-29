package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class aggrcow_spoj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(); // number of stall
			int c = sc.nextInt(); // number of cow
			int[] stall = new int[n];
			for(int i=0;i<n;i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(maxDistance(stall,c));
		}
	}
	private static int maxDistance(int[] stall , int c) {
		int low = stall[0];
		int high =stall[stall.length-1];
		int ans = 0;
		while(low<=high) {
			int mid = (low + high)/2;
			if(isitPossible(stall,c,mid)) {
				ans = mid;
				low = mid+1;
				
			}
			else {
				high = mid -1;
			}
		}
		return ans;
	}
	private static boolean isitPossible(int[] stall, int c, int mid) {
		// TODO Auto-generated method stub
		int pos = stall[0];
		int count =1;
		for(int i=1;i<stall.length;i++) {
			if(stall[i] - pos >= mid) {
				count++;
				pos = stall[i];
				
			}
			if(count == c){
				return true;
			}
		}
		return false;
	}

}
