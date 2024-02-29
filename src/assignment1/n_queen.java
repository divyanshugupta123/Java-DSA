package assignment1;

import java.util.*;
public class n_queen {
    static int ans = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean[][] brd = new boolean[num][num];
		check_answer(brd, num, 0);
        System.out.println(ans);
    }
    public static void check_answer(boolean[][] board, int a, int b) {
		if (a == 0) {
			ans++;
			return;
		}
		if (b >= board.length) {
			return;
		}
		for (int c = 0; c < board[0].length; c++) {

			if (answer(board, b, c)) {
				board[b][c] = true;
				check_answer(board, a- 1, b + 1);
				board[b][c] = false;
			}

		}
	}
    private static boolean answer(boolean[][] board, int a, int count) {
		int r2 = a;
		while (r2 >= 0) {

			if (board[r2][count] == true) {
				return false;
			}
			r2--;
		}

		r2 = a;
		int c2 = count;
		while (r2 >= 0 && c2 >= 0) {
			if (board[r2][c2] == true) 	return false;
			r2--;
			c2--;
		}

		r2 = a;
		c2 = count;
		while (r2 >= 0 && c2 < board[0].length) {
			if (board[r2][c2] == true)	return false;
			r2--;
			c2++;
		}
		return true;
	}
    private static void printans(boolean[][] mat) {
		for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[0].length; j++)		System.out.print(mat[i][j] + " ");
			System.out.println();
		}
		System.out.println();

	}

}