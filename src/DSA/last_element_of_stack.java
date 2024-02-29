package DSA;

import java.util.Stack;

public class last_element_of_stack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(lastValue(st));
	}
	public static int lastValue(Stack<Integer> st) {
		if(st.size()==1) {
			return st.peek();
		}
		int item=st.pop();
		int x= lastValue(st);
		st.push(item);
		return x;
	}

}
