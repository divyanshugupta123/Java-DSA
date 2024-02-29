package recursion;

import java.util.Scanner;

public class rat_in_maze {

	public static void main(String[] args) {
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
		printPath(maze, 0, 0, ans);
		if(f==false) {
			System.out.println("NO PATH FOUND");
		}
	}
	static boolean f=false;
	private static void printPath(char[][] maze,int cr,int cc,int[][] ans) {
		if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X'){
			f=true;
			ans[cr][cc]=1;
			display(ans);
			return;
		}
		if(cr<0 || cc<0||cr>=maze.length||cc>=maze[0].length||maze[cr][cc]=='X') {
			return;
		}
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		printPath(maze, cr-1, cc,ans);
		printPath(maze, cr+1, cc,ans);
		printPath(maze, cr, cc+1,ans);
		printPath(maze, cr, cc-1,ans);
		maze[cr][cc]='O';
		ans[cr][cc]=0;
	}
	private static void display(int[][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
	}
}
