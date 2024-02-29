package recursion;

import java.util.Scanner;

public class boardPath_using_loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPaths(n,0,"");
		
	}
	private static void printPaths(int dest,int start,String ans) {
		if(dest==start) {
			System.out.println(ans);
			return;
		}
		if(start>dest) {
			return;
		}
		for(int i=1;i<=dest-1;i++) {
			printPaths(dest,start+i,ans+i);
		}
	}

}
