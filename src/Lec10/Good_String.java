package Lec10;

import java.util.Scanner;

public class Good_String {
//  return the maximum number of vowels substring 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int ans=playingGoodString(str.toLowerCase());
		System.out.println(ans);
		
	}
	private static int playingGoodString(String str) {
		int ans=0;
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(isvowel(ch)==true) {
				c++;
			}
			else {
				ans=Math.max(ans, c);
				c=0;
			}
		}
		ans=Math.max(ans, c);
		return ans;
		
	}
	private static boolean isvowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return true;
		return false;
	}
}
