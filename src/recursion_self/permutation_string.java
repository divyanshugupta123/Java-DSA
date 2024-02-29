package recursion_self;

public class permutation_string {

	public static void main(String[] args) {
		String str="abc";
		System.out.println(printPermutation(str, ""));
	}
	private static int printPermutation(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return 1;
		}
		int a=0;
		for(int i=0;i<ques.length();i++) {
			String s1=ques.substring(0,i);
			String s2=ques.substring(i+1);
			char ch=ques.charAt(i);
			a+=printPermutation(s1+s2, ans+ch);
		}
		return a;
	}

}
