package DSA;

import java.util.Stack;

public class reverse_Stack_Without_using_extra_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}
	public static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int item=st.pop();
		reverse(st);
		insertdown(st,item);
	}
	public static void insertdown(Stack<Integer> st,int ele) {
		if(st.isEmpty()) {
			st.push(ele);
			return;
		}
		int item=st.pop();
		insertdown(st,ele);
		st.push(item);
	}
}
