package recursion;

public class print_subsequences {

	public static void main(String[] args) {
		String ques="abc";
		PrintSubSequence(ques," ");
	}
	private static void PrintSubSequence(String s,String ans) {
		if(s.length()==0){
			System.out.println(ans+" ");
			return;
		}
		char ch=s.charAt(0);
		PrintSubSequence(s.substring(1), ans);
		PrintSubSequence(s.substring(1), ans+ch);
	}

}