package Trie;

public class minimum_XOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 11;
		int b = 125;
		
	}
	public static int min_value(int a,int b) {
		int c = countSet(b);
		int x = 0;
		for(int i = 31; i>=0 && c>0;i--) {
			if((a&(1<<i))!=0) {
				x+=(1<<i);
				c--;
			}
		}
		return x;
		
	}
	public static int countSet(int b) {
		int c = 0;
		while(b>0) {
			c++;
			b = b&(b-1);
			
		}
		return c ;
	}

}
