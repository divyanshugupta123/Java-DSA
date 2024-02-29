package recursion_self;

public class no_head_consecutive_occurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		printHTC(n,0,"");
		
	}

	private static void printHTC(int n, int i, String str) {
		// TODO Auto-generated method stub
		if(i==n) {
			System.out.println(str);
			return;
		}
		if(i==0||(i>=1 && str.charAt(i-1)!='H')) {
			printHTC(n,i+1,str+'H');
		}
		printHTC(n, i+1, str+'T');
		
	}
}
