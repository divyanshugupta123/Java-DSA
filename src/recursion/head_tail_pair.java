package recursion;

import java.util.Scanner;

public class head_tail_pair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printHeadTail(0,"", n);
	}
	private static void printHeadTail(int i,String temp,int n) {
		if(i==n) {
			System.out.println(temp);
			return;
		}
		printHeadTail(i+1, temp+"H", n);
		printHeadTail(i+1, temp+"T", n);
	}

}
