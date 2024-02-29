package recursion;

public class tricky_permutation_string {

	public static void main(String[] args) {
		String str="abca";
		printAnswer(str,"");
	}

	private static void printAnswer(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			boolean flag=true;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(j)==ch) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				String s1=str.substring(0,i);
				String s2=str.substring(i+1);
				printAnswer(s1+s2,ans+ch);
			}
			
		}
	}
	

}

