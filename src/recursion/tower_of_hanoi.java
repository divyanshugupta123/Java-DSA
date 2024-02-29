package recursion;

public class tower_of_hanoi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		toh(n,"a","b","c");
	}

	private static void toh(int n, String src, String help, String des) {
		if(n==0) {
			return;
		}
		// TODO Auto-generated method stub
		toh(n-1,src,des,help);
		System.out.println("move "+n+"th disc from "+src+" to "+des);
		toh(n-1,help,src,des);
		return;
	}

}
