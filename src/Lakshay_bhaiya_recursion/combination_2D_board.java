package Lakshay_bhaiya_recursion;

public class combination_2D_board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combintaion_2D(0,0,2,3,3,"");
	}
	public static void combintaion_2D(int r,int c,int queen,int total_row,int total_col,String path) {
		if(queen==0) {
			System.out.println(path);
			return;
		}
		if(c==total_col) {
			c=0;
			r++;
		}
		if(r==total_row) {
			return;
		}
		combintaion_2D(r,c+1,queen-1,total_row,total_col,path+"Q{"+r+","+c+"}");
		combintaion_2D(r,c+1,queen,total_row,total_col,path);
	}
}