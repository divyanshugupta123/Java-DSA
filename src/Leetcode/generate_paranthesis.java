package Leetcode;
import java.util.*;
public class generate_paranthesis {

	public static void main(String[] args) {
		int n=3;
		
		List<String> list=new ArrayList<>();
		generateParanthesis(n, 0, 0, "",list);
		System.out.println(list);
	}
	private static void generateParanthesis(int n,int opening,int closing,String str,List<String> list) {
		if(opening==n && closing==n) {
			list.add(str);
			return;
		}
		if(opening<n) {
		generateParanthesis(n, opening+1, closing, str+"(",list);
		}
		if(closing<opening) {
		generateParanthesis(n, opening, closing+1, str+")",list);
		}
	}

}