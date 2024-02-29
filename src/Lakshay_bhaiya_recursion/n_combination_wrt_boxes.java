package Lakshay_bhaiya_recursion;

public class n_combination_wrt_boxes {

	public static void main(String[] args) {
		String ques="abcd";
		printCombination(ques,"");
		
	}
	private static void printCombination(String ques,String ans) {
		if(ans.length()==2) {
			System.out.println(ans);
			return;
		}
		if(ques.length()==0) {
			return;
		}
		char ch=ques.charAt(0);
			printCombination(ques.substring(1), ans+ch);
			printCombination(ques.substring(1), ans);		
	}
}
