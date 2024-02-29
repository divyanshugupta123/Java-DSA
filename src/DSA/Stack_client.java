package DSA;

public class Stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack1 st = new Stack1(3);
//		st.peek();
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(1);
		st.display();
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.display();
	}

}
