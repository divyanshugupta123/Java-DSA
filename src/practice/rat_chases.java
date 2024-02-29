package practice;

import java.util.Scanner;

public class rat_chases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] grid = new char[n][m];
		for(int i=0;i<grid.length;i++) {
			String s=sc.next();
			for(int j=0;j<grid[0].length;j++) {
				
				grid[i][j]=s.charAt(j);
				
			}
		}
		int ans[][] =new int[n][m];
		printPath(grid,ans,0,0);
		if(f==false) {
			System.out.println("NO PATH FOUND");
		}
		
	}
	static boolean f=false;
	public static void printPath(char[][] grid,int[][] ans,int cr,int cc) {
		if(cr<0 || cc<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]=='X') {
			return;
		}
		if(cr==grid.length-1 && cc==grid[0].length-1 && grid[cr][cc]!='X') {
			ans[cr][cc]=1;
			f=true;
			display(ans);
			return;
		}
		grid[cr][cc]='X';
		ans[cr][cc]=1;
		int[] r = {0,1,0,-1};
		int[] c = {1,0,-1,0};
		
		for(int i=0;i<r.length;i++) {
			printPath(grid,ans,cr+r[i],cc+c[i]);
		}
		grid[cr][cc]='0';
		ans[cr][cc]=0;
	}
	public static void display(int[][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
