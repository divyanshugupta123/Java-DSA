package recursion;

public class string_permutation {

	public static void main(String[] args) {
		String str="abc";
		printAnswer(str,"");
	}

	private static void printAnswer(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			String s1=str.substring(0,i);
			String s2=str.substring(i+1);
			char ch=str.charAt(i);
			printAnswer(s1+s2,ans+ch);
		}
	}
	

}
