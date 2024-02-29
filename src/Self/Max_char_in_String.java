package Self;

import java.util.Scanner;

public class Max_char_in_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		maxChar(str);
	}
	private static void maxChar(String str) {
		char[] chararr=new char[str.length()];
		chararr=str.toCharArray();
		int[] frequency=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			frequency[i]=1;
			for(int j=0;j<str.length();j++) {
				if(chararr[i]==chararr[j]) {
					frequency[i]++;
				}
			}
		}
		char maxchar=str.charAt(0);
		int max=frequency[0];
		for(int i=0;i<str.length();i++) {
			if(max<frequency[i]) {
				max=frequency[i];
				maxchar=chararr[i];
			}
		}
		System.out.println(maxchar);
	}

}
