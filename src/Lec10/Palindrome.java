package Lec10;

public class Palindrome {

	public static void main(String[] args) {
		String str1="HelleH";
		System.out.println(ispalindrome(str1));
	}
	private static boolean ispalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
