package recursion;

public class number_of_subsequences {
	
	public static void main(String[] args) {
		
		String ques="abc";
		System.out.println(PrintSubSequence(ques, " "));
	}
//	static int count=0;
	
	private static int PrintSubSequence(String s,String ans) {
		if(s.length()==0){
//			System.out.println(ans+" ");
//			count++;
			return 1;
		}
		char ch=s.charAt(0);
		int a=PrintSubSequence(s.substring(1), ans);
		int b=PrintSubSequence(s.substring(1), ans+ch);
		return a+b;
	}

}