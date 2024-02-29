package practice;

import java.util.Stack;

public class reverse_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		System.out.println("**************");
		reverse_Stack(st);
		System.out.println(st);
	}
	private static void reverse_Stack(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int x = st.pop();
		reverse_Stack(st);
		insert_down(st,x);
		
	}
	private static void insert_down(Stack<Integer> st , int x) {
		if(st.isEmpty()) {
			st.push(x);
			return;
		}
		int y = st.pop();
		insert_down(st, x);
		st.push(y);
	}

}
