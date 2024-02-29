package Lec10;

public class Print_all_substring {

	public static void main(String[] args) {
		String str="hello";
		printSubstring(str);
	}
	private static void printSubstring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}
}