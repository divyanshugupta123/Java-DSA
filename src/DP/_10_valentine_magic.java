package DP;

import java.util.Arrays;

public class _10_valentine_magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = {2,11,3};
		int[] girls = {5,7,3,2};
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(mindif(boys, girls, 0, 0));
	}
	private static int mindif(int[] boys,int[] girls,int i ,int j) {
		if(i == boys.length) {
			return 0;
		}
		if(j == girls.length) {
			return 9999999;
		}
		int pair = Math.abs(boys[i]-girls[j])+mindif(boys,girls,i+1,j+1);
		int nopair = mindif(boys,girls,i,j+1);
		return Math.min(pair, nopair);
	}
}
