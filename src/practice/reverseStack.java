package practice;

import java.util.Stack;

public class reverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}
	private static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int item=st.pop();
		reverse(st);
		insertDown(st,item);
	}
	private static void insertDown(Stack<Integer> st,int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		int a=st.pop();
		insertDown(st, item);
		st.push(a);
	}

}
