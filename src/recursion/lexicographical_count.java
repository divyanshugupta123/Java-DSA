package recursion;

public class lexicographical_count {

	public static void main(String[] args) {
		printCounting(0, 1000);
	}
	private static void printCounting(int cur,int n) {
		if(cur>n) {
		return;
		}
		System.out.println(cur);
		int i=0;
		if(cur==0) {
			i=1;
		}
		for(;i<=9;i++) {
			printCounting(cur*10+i, n);
		}
	}
}
