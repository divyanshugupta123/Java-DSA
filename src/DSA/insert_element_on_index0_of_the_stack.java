package DSA;

import java.util.Stack;

public class insert_element_on_index0_of_the_stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		lastValue(st,7);
		System.out.println(st);
	}
	public static void lastValue(Stack<Integer> st,int ele) {
		if(st.isEmpty()) {
			st.push(ele);
			return;
		}
		int item=st.pop();
		lastValue(st,ele);
		st.push(item);
	}
	

}
