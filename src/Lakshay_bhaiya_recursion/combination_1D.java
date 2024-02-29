package Lakshay_bhaiya_recursion;

public class combination_1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combination_1D(0, 2, "", 4);

	}
	private static void combination_1D(int cc,int queen,String path,int total_cols) {
		if(queen==0) {
			System.out.println(path);
			return;
		}
		if(cc==total_cols) {
			return;
		}
		combination_1D(cc+1, queen-1, path+"q"+cc, total_cols);
		combination_1D(cc+1, queen, path, total_cols);
	}
}
