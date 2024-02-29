package assignment1;

import java.util.*;
public class n_knight {
    static int cnt=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] brd = new boolean[n][n];
		answer(brd, 0, 0, "", n);
		System.out.println("\n"+cnt);
    }
    public static boolean protect(boolean[][] board, int r, int count) {
		int r2[] = { -1, -1, -2, -2 };
		int c2[] = { 2, -2, 1, -1 };
		for (int i = 0; i < c2.length; i++) {
			int X = r + r2[i];
			int Y = count + c2[i];
			if (X >= 0 && Y >= 0 && Y < board.length && board[X][Y] == true) {
				return false;
			}
		}
		return true;
	}
    public static void answer(boolean[][] board, int r, int count, String ans, int a) {
		if (a == 0) {
			System.out.print(ans + " ");
			cnt++;
			return;
		}

		if (count == board.length) {
			r++;
			count = 0;
		}
		if (r == board.length) {
			return;
		}
		if (protect(board, r, count)) {
			board[r][count] = true;

			answer(board, r, count + 1, ans + "{" + r + "-" + count + "} ", a - 1);
			board[r][count] = false;

		}
		answer(board, r, count + 1, ans, a);
	}
}