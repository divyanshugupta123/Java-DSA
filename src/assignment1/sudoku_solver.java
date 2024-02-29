package assignment1;

import java.util.*;
public class sudoku_solver {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        solution(arr,0,0);
    }
    public static void solution(int[][] arr, int a, int count) {
//		int c;
		// TODO Auto-generated method stub
		if (count == 9) {
			a++;
			count = 0;
		}
		if (a == 9) {
			printMat(arr);
			return;
		}

		if (arr[a][count] != 0) {
			solution(arr, a, count + 1);
		} else {
			for (int v = 1; v <= 9; v++) {
				if (funcount(arr, a, count, v) == true) {

					arr[a][count] = v;
					solution(arr, a, count + 1);
					arr[a][count] = 0;
				}

			}
		}

	}
	private static boolean funcount(int[][] arr, int a, int count, int b) {

		int r2 = 0;
		while (r2 < 9) {
			if (arr[r2][count] == b) {
				return false;
			}
			r2++;
		}
		int c2 = 0;
		while (c2 < 9) {
			if (arr[a][c2] == b) {
				return false;
			}
			c2++;
		}
		r2 = a - a % 3;
		c2 = count - count % 3;
		for (int i = r2; i < r2 + 3; i++) {
			for (int j = c2; j < c2 + 3; j++) {
				if (arr[i][j] == b) {
					return false;
				}
			}
		}
		return true;
	}

	public static void printMat(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}
}