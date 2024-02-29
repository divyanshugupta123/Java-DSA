package practice;

import java.util.ArrayList;
import java.util.List;

public class palindromic_partioning {
	public static void main(String[] args) {
		String str="nitin";
		List<String> ll =new ArrayList<>();
		List<List<String>> ans =new ArrayList<>();
		
		
		printpartioning(str, ll,ans);
		System.out.println(ans);
	}
	private static void printpartioning(String ques,List<String> ll,List<List<String>> ans) {
		if(ques.length()==0) {
			ans.add(new ArrayList<>(ll));
//			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s=ques.substring(0,i);
			if(isPalindrome(s)) {
				ll.add(s);
				printpartioning(ques.substring(i),ll,ans);
				ll.remove(ll.size()-1);
			}
		}
			
	}
	private static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
