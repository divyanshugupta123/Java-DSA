package DSA;

import java.util.Stack;

public class stockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,6,1,4,18,7,5,11};
		calSpan(arr);
	}
	public static void calSpan(int[] arr) {
		int [] ans=new int[arr.length];
		Stack<Integer> st=new Stack<>();
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