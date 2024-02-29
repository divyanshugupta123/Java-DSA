package practice;

import java.util.Scanner;

public class find_x_less_then_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(find_max_val_ofX(n));
	}
	
	private static int find_max_val_ofX(int ele) {
		int low = 1;
		int high = (int)Math.sqrt(ele);
		int ans=0;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(Math.pow(mid, 2)<=ele) {
				ans = mid;
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
