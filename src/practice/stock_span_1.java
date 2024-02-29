package practice;

import java.util.Stack;

public class stock_span_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20,25,40,38,35};
		colSpan(arr);
	}
	private static void colSpan(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+" ");
		}
	
	}

}
