package Leetcode;
import java.util.*;

public class Max_len_of_substring_without_repeating_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(max_len(str));
		
	}
	private static int max_len(String str) {
		int arr[]= new int[256];
		int len=0;
		int ans=0;
		int si=0;
		int ei=0;
		while(ei<str.length()) {
			arr[str.charAt(ei)]++;
			while(arr[str.charAt(ei)]>1) {
				arr[str.charAt(si)]--;
				si++;
			}
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
