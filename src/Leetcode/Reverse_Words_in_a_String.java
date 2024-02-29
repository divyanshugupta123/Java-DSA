package Leetcode;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		String str=" the sky is blue ";
//		System.out.println(str.trim());//trim function helps to remove space from start and from end
		
		System.out.println(reverseWords1(str));
	}
	private static String reverseWords1(String s) {
		s=s.trim();
		String[] arr=s.split("\s+");
		String ans="";
		for(int i=arr.length-1;i>=0;i--) {
			ans=ans+arr[i]+" ";
		}
		ans.trim();
		return ans;
	}
}
