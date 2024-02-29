package recursion;

import java.util.Scanner;

public class cheesy_rat_in_maze_using_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] maze=new char[n][m];
		for(int i=0;i<maze.length;i++) {
			String s=sc.next();
			for(int j=0;j<maze[0].length;j++) {
				maze[i][j]=s.charAt(j);
			}
		}
		int[][] ans=new int[n][m];
		printPath(maze, ans, 0, 0);
		if(f==false) {
			System.out.println("NOT FOUND");
		}
	}
	private static void printPath(char[][] maze,int[][] ans,int cr,int cc) {
		if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X') {
			ans[cr][cc]=1;
			f=true;
			display(ans);
			return;
		}
		if(cr<0 || cc<0 || cr>maze.length-1 || cc>maze[0].length-1 || maze[cr][cc]=='X') {
			return;
		}
		
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		int[] r= {-1,1,0,0};
		int[] c= {0,0,1,-1};
		for(int i=0;i<r.length;i++) {
			printPath(maze, ans, cr+r[i], cc+c[i]);
		}
		maze[cr][cc]='O';
		ans[cr][cc]=0;
	}
	static boolean f=false;
	public static void display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}
}
