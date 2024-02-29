package Leetcode;
import java.util.*;
public class Min_Window_Substring_76 {
	public static void main(String[] args) {
		String s="ADOBECODEBANC";
		String t="ABC";
//		Scanner sc=new Scanner(System.in);
//      String s=sc.nextLine();
//      String t=sc.nextLine();
		System.out.println(minimumWindow(s, t));
	}
	private static String minimumWindow(String s,String t) {
		int[] fret=new int[123];
		for(int i=0;i<t.length();i++) {
			char ch=t.charAt(i);
			fret[ch]++;
		}
		int[] fres=new int[123];
		int si=0;
		int ei=0;
		int start=-1;
		int len=Integer.MAX_VALUE;
		int c=0;
		while(ei<s.length()) {
//			GROW
			char ch=s.charAt(ei);
			fres[ch]++;
			if(fret[ch]>=fres[ch]) {
				c++;
			}
//			SHRINK
			if(c==t.length()) {
				while(fres[s.charAt(si)]>fret[s.charAt(si)] && si<=ei) {
					fres[s.charAt(si)]--;
					si++;
				}
//			answer
				if(len>ei-si+1) {
					len=ei-si+1;
					start=si;
				}
			}
			ei++;
		}
		if(start==-1) {
			return "";
		}
		return s.substring(start,start+len);
	}
}
