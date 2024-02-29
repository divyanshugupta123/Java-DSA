package recursion;

public class keypad{

	static String[] key= {"","abc","def","ghi","jkl","mno","pqr","stuv","wx","yz"};
	
	public static void main(String[] args) {
		printkeypad("12", "");
	}
	private static void printkeypad(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);//'1'
		String press=key[ch-'0'];//ascii value of 1 is 49 minus of ascii of 0 i.e. 48 or a character 0
		for(int i=0;i<press.length();i++) {
			printkeypad(ques.substring(1), ans+press.charAt(i));
		}
	}

}
