package recursion;

import java.util.Scanner;

public class N_QUEEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=4;
		boolean[][] board=new boolean[n][n];
		nqueen(board,0,n);
	}
	private static void nqueen(boolean[][] board, int row, int n) {
		
		if(n==0) {
			printMat(board);
			return;
		}
		for(int col=0;col<board.length;col++) {
			if(isSafe(board,row,col)==true) {
				board[row][col]=true;
				nqueen(board, row+1, n-1);
				board[row][col]=false;
			}
		}
	}
	private static boolean isSafe(boolean[][] board, int row, int col) {
		
		int r=row;
		while(r>=0) {
			if(board[r][col]) {
				return false;
			}
			r--;
		}
		r=row;int c=col;
		while(r>=0 && c>=0) {
			if(board[r][c])
				return false;
			r--;
			c--;
		}
		
		r=row;c=col;
		while(r>=0 && c<board.length) {
			if(board[r][c])
				return false;
			r--;
			c++;
		}
		return true;
	}

	private static void printMat(boolean[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
