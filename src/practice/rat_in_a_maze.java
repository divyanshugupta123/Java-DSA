package practice;

import java.util.Scanner;

public class rat_in_a_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] arr=new char[n][m];
		for(int i=0;i<arr.length;i++) {
			String s=sc.next();
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=s.charAt(j);
			}
		}
		int[][] ans=new int[n][m];
		printPath(arr, ans, 0, 0);
		if(f==false) {
			System.out.println("-1");
		}
		
	}
	static boolean f=false;
	private static void printPath(char[][] maze,int[][] ans,int cr,int cc) {
		if(cr>=maze.length||cc>=maze[0].length||maze[cr][cc]=='X') {
			return;
		}
		if(cr==maze.length-1 && cc==maze[0].length-1) {
			
				ans[cr][cc]=1;
				f=true;
				display(ans);
				return;
			
		}
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		printPath(maze, ans, cr, cc+1);
		if(f) {
			return;
		}
		printPath(maze, ans, cr+1, cc);
		if(f) {
			return;
		}
		maze[cr][cc]='O';
		ans[cr][cc]=0;
		return;
	}
	private static void display(int[][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
