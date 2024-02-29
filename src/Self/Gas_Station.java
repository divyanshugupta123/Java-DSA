package Self;

import java.util.Arrays;
import java.util.Scanner;

public class Gas_Station {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int[] gas=new int[n];
		int[] cost=new int[n];
		for(int i=0;i<gas.length;i++) {
			gas[i]=sc.nextInt();
			cost[i]=sc.nextInt();
		}
		System.out.println(gasStation(gas,cost));
//		System.out.println(Arrays.toString(gas));
//		System.out.println(Arrays.toString(cost));
	}
	private static int gasStation(int[] gas,int[] cost) {
		int tc = 0;  //tc stands for total count if total count is less than 0 return -1
		for(int i=0;i<gas.length;i++) {
			tc=tc+gas[i]-cost[i];
		}
		if(tc<0) {
			return -1;
		}
		int cur=0; //current cost
		int si=0;
		for(int i=0;i<gas.length;i++) {
			cur=cur+gas[i]-cost[i];
			if(cur<0) {
				cur=0;
				si=i+1;
			}
			
		}
		return si;
	}

}
