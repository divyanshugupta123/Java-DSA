package practice;

import java.util.Scanner;
import java.util.Stack;

public class nextgreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		nextgr(arr);
	}
	private static void nextgr(int[] arr) {
		int[] ans=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				ans[st.pop()]=arr[i];
				
			}
			
			st.push(i);
			
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
