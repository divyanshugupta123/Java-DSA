package recursion;

public class sudoku_solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= {{5 ,3 ,0, 0 ,7 ,0 ,0 ,0 ,0}, 
				{6 ,0 ,0 ,1 ,9 ,5 ,0 ,0 ,0}, 
				{0 ,9 ,8 ,0 ,0 ,0 ,0 ,6 ,0},
				{8 ,0 ,0 ,0 ,6 ,0 ,0 ,0 ,3}, 
				{4 ,0 ,0 ,8 ,0 ,3 ,0 ,0 ,1}, 
				{7 ,0 ,0 ,0 ,2 ,0 ,0 ,0 ,6},
				{0 ,6 ,0 ,0 ,0, 0 ,2 ,8 ,0},
				{0 ,0 ,0 ,4 ,1 ,9 ,0 ,0 ,5},
				{0 ,0 ,0 ,0 ,8 ,0 ,0 ,7 ,9}};
		sudokusolver(grid,0,0);
	}
	private static void sudokusolver(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
//		if(row==9) {
//			printMat(grid);
//			return;
//		}
		if(col==9) {
			row++;
			col=0;
		}
		if(row==9) {
			printMat(grid);
			return;
		}
		
		if(grid[row][col]!=0) {
			sudokusolver(grid, row, col+1);
		}
		else {
			for(int i=1;i<=9;i++) {
				if(isPossible(grid,row,col,i)==true) {
					grid[row][col]=i;
					sudokusolver(grid, row, col+1);
					grid[row][col]=0;
				}
			}
		}
		
	}
	private static boolean isPossible(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		
		//row
		int c=0;
		while(c<9) {
			if(grid[row][c]==val) {
				return false;
			}
			c++;
		}
		
		//col
		int r=0;
		while(r<9) {
			if(grid[r][col]==val) {
				return false;
			}
			r++;
		}
		
		//3 * 3 matrix checking
		r=row-row%3;
		c=col-col%3;
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}
	private static void printMat(int[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
