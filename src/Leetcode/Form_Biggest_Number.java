package Leetcode;
import java.util.*;
public class Form_Biggest_Number {

	public static void main(String[] args) {
		int[] arr= {54,546,548,60};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	private static void sort(int[] arr) {
		int max=arr[0];
		for(int pass=1;pass<arr.length;pass++) {
			for(int i=0;i<arr.length-pass;i++) {
				if(compare(arr[i],arr[i+1])>0) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
	private static long compare(int x,int y) {
		String xy=""+x+y;
		String yx=""+y+x;
		return Long.parseLong(yx)-Long.parseLong(xy);
		
	}

}
