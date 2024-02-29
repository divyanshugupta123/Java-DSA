package recursion;

import java.util.Scanner;

public class rat_in_maze_2steps {

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
		print_path(maze, ans, 0, 0);
		if(f==false) {
			System.out.println("NO PATH FOUND");
		}
	}
	static boolean f=false;
	private static void print_path(char[][] maze,int[][] ans,int cr,int cc) {
		if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X'){
			f=true;
			ans[cr][cc]=1;
			display(ans);
			return;
		}
		if(cr>=maze.length||cc>=maze[0].length||maze[cr][cc]=='X') {
			return;
		}
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		print_path(maze, ans, cr, cc+1);
		print_path(maze, ans, cr+1, cc);
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