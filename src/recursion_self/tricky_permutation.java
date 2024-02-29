package recursion_self;

public class tricky_permutation {

	public static void main(String[] args) {
		String str="abca";
		printPermutation(str,"");
	}

	private static void printPermutation(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		int flag=0;
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			for(int j=i+1;j<ques.length();j++) {
				if(ques.charAt(j)==ch) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				String s1=ques.substring(0,i);
				String s2=ques.substring(i+1);
				printPermutation(s1+s2, ans+ch);
			}
		}
	}

}
